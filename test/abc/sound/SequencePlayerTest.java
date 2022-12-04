package abc.sound;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import abc.model.Music;
import abc.model.Note;
import abc.parser.AbcLexer;
import abc.parser.AbcParser;
import abc.parser.NoteListener;

public class SequencePlayerTest {

	@Test
	public void test() {
		String fileName = "sample_abc/abc_song.abc";
		try {
			CharStream input = fromFileName(fileName);
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
}
