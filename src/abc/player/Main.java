package abc.player;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import abc.model.Music;
import abc.model.Note;
import abc.parser.AbcLexer;
import abc.parser.AbcParser;
import abc.parser.NoteListener;
import abc.sound.SequencePlayer;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     */
    public static void play(String file) {
		try {
			CharStream input = fromFileName(file);
			AbcLexer lexer = new AbcLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			AbcParser parser = new AbcParser(tokens);
			ParseTree tree = parser.abc_tune();
			// Walk Tree
			ParseTreeWalker walker = new ParseTreeWalker();
			NoteListener l = new NoteListener();
			walker.walk(l, tree);

			// Make and play music
			SequencePlayer player = null;
			int i = 0;
			for (Music m : l.getMusics()) {
				i++;
				if (i != 4) ;
				if (player == null) {
					player = new SequencePlayer(m.getTempo(), m.getMeter());
				}
				for (Note n : m.getNotes()) {
					player.addNote(n.getNote(), n.getStartTick(), n.getNumTicks());
				}
			}
			System.out.println(player);
			player.play();
			while (player.isPlaying()) {
				Thread.sleep(100);
			}
		} catch (InterruptedException | IOException | MidiUnavailableException | InvalidMidiDataException e) {
			e.printStackTrace();
		}
    }

    public static void main(String[] args) {
        // CALL play() HERE USING ARGS
    	if (args.length == 0) {
    		System.out.print("Please pass the name of the music file you would like to run "
        			+ "(i.e. 'sample_abc/abc_song.abc'): ");
    		System.exit(1);
    	}
    	play(args[0]);
    }
}
