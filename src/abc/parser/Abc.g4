/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

/*
 * Lexer Rules
 */

NEW_LINE              : ('\n' | '\r' '\n'?);
WHITESPACE            : (' ' | '\t');
DIGIT                 : [0-9];
//TEXT                : [a-zA-Z]+;
UNKNOWN               : . ;

/*
 * Parser Rules Header
 */

keynote               : basenote key_accidental?;
key                   : keynote mode_minor?;
tempo                 : meter_fraction '=' DIGIT+;
meter_fraction        : DIGIT+ '/' DIGIT+;
meter                 : ('C' | 'C|' | meter_fraction);
note_length_strict    : DIGIT+ '/' DIGIT+;

field_number          : 'X:' WHITESPACE* DIGIT end_of_line;
field_title           : 'T:' ~NEW_LINE+ end_of_line;
field_composer        : 'C:' ~NEW_LINE+ end_of_line;
field_default_length  : 'L:' note_length_strict end_of_line;
field_meter           : 'M:' meter end_of_line;
field_tempo           : 'Q:' tempo end_of_line;
field_voice           : 'V:' WHITESPACE* DIGIT+ end_of_line;
field_key             : 'K:' key end_of_line;
other_fields          : (field_composer | field_default_length | field_meter | field_tempo | field_voice | comment);

abc_header            : field_number comment* field_title other_fields* field_key;

/*
 * Parser Rules Music
 */

abc_music             : mid_tune_field* abc_line+;
abc_line              : element* NEW_LINE | mid_tune_field | comment;
element               : note_element | tuplet_element | barline | nth_repeat | WHITESPACE;

note_element          : note | multi_note;
note                  : note_or_rest note_length?;
note_or_rest          : pitch | rest;
pitch                 : accidental? basenote octave?;
octave                : '\''+ | ','+;
note_length           : (DIGIT+)? ('/' (DIGIT+)?)?;
rest                  : 'z';
tuplet_element        : tuplet_spec note_element+;
tuplet_spec           : '(' DIGIT;
multi_note            : '[' note+ ']';
barline               : '|' | '||' | '[|' | '|]' | ':|' | '|:';
nth_repeat            : '[1' | '[2';
mid_tune_field        : field_voice;

comment               : '%' ~NEW_LINE* NEW_LINE;
end_of_line           : (comment | NEW_LINE);
basenote              : ('C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b');
accidental            : ('^' | '^^' | '_' | '__' | '=');
key_accidental        : ('#' | 'b');
mode_minor            : 'm';

abc_tune              : abc_header abc_music;
