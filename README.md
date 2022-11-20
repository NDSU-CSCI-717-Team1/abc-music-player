# abc-music-player
CSCI 717 Music Player Group Project

https://ocw.mit.edu/ans7870/6/6.005/s16/projects/abcplayer/#project_abc_music_player

# Team Members
* sriram.atluri@ndsu.edu
* keinan.balsam@ndsu.edu
* aravind.elamurugan@ndsu.edu
* scott.hutchings@ndsu.edu

# Helpful Tools
* Eclipse zip editor (view class contents of zip fiels in /lib).

# Antlr
To generate and compile the lexer/parser grammar files, navagate the /src directory       
1. Run `~/git/abc-music-player/src # java -cp ../lib/antlr.jar org.antlr.v4.Tool abc/parser/Abc.g4 && javac -cp ../lib/antlr.jar abc/parser/Abc*.java`    

Then to run the TestRig tool (grun) against the generated & compiled sources 
1. Run `~/git/abc-music-player/src # grun abc.parser.Abc abc_tune ../sample_abc/sample2.abc -gui`
