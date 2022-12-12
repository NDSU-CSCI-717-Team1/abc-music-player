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
* Run `~/abc-music-player/src # java -cp ../lib/antlr.jar org.antlr.v4.Tool abc/parser/Abc.g4 && javac -cp ../lib/antlr.jar abc/parser/Abc*.java`    

Then to run the TestRig tool (grun) against the generated & compiled sources 
* Run `~/abc-music-player/src # grun abc.parser.Abc abc_tune ../sample_abc/sample2.abc -gui`

# Mac Run Project Via Terminal
1. Compile the project including library jars.   
`~/abc-music-player/src # javac **/*.java -cp '../lib/*'`
1. Use java to run the music file of your choice.  
`~/abc-music-player/src # java -cp .:../lib/'*' abc.player.Main ../sample_abc/piece2.abc`

# Windows Run in MinGW
1. To compile, first use the find command to list all of the java files recursively in the `src/` directory. Then copy that list into the javac command.
* ```~/abc-music-player/src # sources=`find -name "*.java" | tr '\n' ' '` ```
* `~/abc-music-player/src # javac $sources -cp '../lib/*'`
1. Run in java with (note the semi colon)
* `~/abc-music-player/src # java -cp ".;../lib/*" abc.player.Main ../sample_abc/piece2.abc`