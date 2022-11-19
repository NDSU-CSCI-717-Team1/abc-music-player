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
 
NEW_LINE              : ('\r' '\n'? | '\r')+ ;
TEXT                  : ~[\])]+ ;
WHITESPACE            : (' ' | '\t');
DIGIT                 : [0-9];

/*
 * Parser Rules
 */
 
comment               : '%' TEXT NEW_LINE;
end_of_line           : (NEW_LINE | comment);
basenote              : ('C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b');
accidental            : ('^' | '^^' | '_' | '__' | '=');
key_accidental        : ('#' | 'b');
mode_minor            : 'm';
keynote               : basenote key_accidental?;
key                   : keynote mode_minor?;
tempo                 : meter_fraction '=' DIGIT+;
meter_fraction        : DIGIT+ '/' DIGIT+;
meter                 : ('C' | 'C|' | meter_fraction);
note_length_strict    : DIGIT+ '/' DIGIT+;

field_number          : 'X:' DIGIT+ end_of_line;
field_title           : 'T:' TEXT end_of_line;
field_composer        : 'C:' TEXT end_of_line;
field_default_length  : 'L:' note_length_strict end_of_line;
field_meter           : 'M:' meter end_of_line;
field_tempo           : 'Q:' tempo end_of_line;
field_voice           : 'V:' TEXT end_of_line;
field_key             : 'K:' key end_of_line;
other_fields          : (field_composer | field_default_length | field_meter | field_tempo | field_voice | comment);

abc_header            : field_number comment* field_title other_fields* field_key;
abc_tune              : abc_header;
