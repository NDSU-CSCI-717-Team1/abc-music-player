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
	public void piece1() {
		try {
			SequencePlayer player = new SequencePlayer(140, 12);

			player.addNote(new Pitch('C').toMidiNote(), 0, 12);
			player.addNote(new Pitch('C').toMidiNote(), 12, 12);
			player.addNote(new Pitch('C').toMidiNote(), 24, 9);
			player.addNote(new Pitch('D').toMidiNote(), 33, 3);
			player.addNote(new Pitch('E').toMidiNote(), 36, 12);

			player.addNote(new Pitch('E').toMidiNote(), 48, 9);
			player.addNote(new Pitch('D').toMidiNote(), 57, 3);
			player.addNote(new Pitch('E').toMidiNote(), 60, 9);
			player.addNote(new Pitch('F').toMidiNote(), 69, 3);
			player.addNote(new Pitch('G').toMidiNote(), 72, 24);

			player.addNote(new Pitch('D').transpose(12).toMidiNote(), 96, 4);
			player.addNote(new Pitch('D').transpose(12).toMidiNote(), 100, 4);
			player.addNote(new Pitch('D').transpose(12).toMidiNote(), 104, 4);
			player.addNote(new Pitch('G').toMidiNote(), 108, 4);
			player.addNote(new Pitch('G').toMidiNote(), 112, 4);
			player.addNote(new Pitch('G').toMidiNote(), 116, 4);

			player.addNote(new Pitch('E').toMidiNote(), 120, 4);
			player.addNote(new Pitch('E').toMidiNote(), 124, 4);
			player.addNote(new Pitch('E').toMidiNote(), 128, 4);
			player.addNote(new Pitch('C').toMidiNote(), 132, 4);
			player.addNote(new Pitch('C').toMidiNote(), 136, 4);
			player.addNote(new Pitch('C').toMidiNote(), 140, 4);

			player.addNote(new Pitch('G').toMidiNote(), 144, 9);
			player.addNote(new Pitch('F').toMidiNote(), 153, 3);
			player.addNote(new Pitch('E').toMidiNote(), 156, 9);
			player.addNote(new Pitch('D').toMidiNote(), 165, 3);
			player.addNote(new Pitch('C').toMidiNote(), 168, 24);

			System.out.println(player);

			player.play();
			Thread.sleep(10000);

		} catch (MidiUnavailableException midiUe) {
			midiUe.printStackTrace();
		} catch (InvalidMidiDataException invalidMidiDe) {
			invalidMidiDe.printStackTrace();
		} catch (InterruptedException intEx) {
			intEx.printStackTrace();
		}
	}

	@Test
	public void piece2() {
		try {
			SequencePlayer player = new SequencePlayer(200, 12);

			player.addNote(new Pitch('E').transpose(1).toMidiNote(), 0, 6);
			player.addNote(new Pitch('F').transpose(12).toMidiNote(), 0, 6);
			player.addNote(new Pitch('E').transpose(1).toMidiNote(), 6, 6);
			player.addNote(new Pitch('F').transpose(12).toMidiNote(), 6, 6);

			player.addNote(new Pitch('E').transpose(1).toMidiNote(), 18, 6);
			player.addNote(new Pitch('F').transpose(12).toMidiNote(), 18, 6);

			player.addNote(new Pitch('C').transpose(1).toMidiNote(), 30, 6);
			player.addNote(new Pitch('F').transpose(12).toMidiNote(), 30, 6);

			player.addNote(new Pitch('E').transpose(1).toMidiNote(), 36, 12);
			player.addNote(new Pitch('F').transpose(12).toMidiNote(), 36, 12);

			player.addNote(new Pitch('G').toMidiNote(), 48, 12);
			player.addNote(new Pitch('B').toMidiNote(), 48, 12);
			player.addNote(new Pitch('G').transpose(12).toMidiNote(), 48, 12);

			player.addNote(new Pitch('G').toMidiNote(), 72, 12);

			player.addNote(new Pitch('C').transpose(12).toMidiNote(), 96, 18);
			player.addNote(new Pitch('G').toMidiNote(), 114, 6);

			player.addNote(new Pitch('E').toMidiNote(), 132, 12);

			player.addNote(new Pitch('E').toMidiNote(), 144, 6);
			player.addNote(new Pitch('A').toMidiNote(), 150, 12);
			player.addNote(new Pitch('B').toMidiNote(), 162, 12);
			player.addNote(new Pitch('B').transpose(-1).toMidiNote(), 174, 6);
			player.addNote(new Pitch('A').toMidiNote(), 180, 12);

			player.addNote(new Pitch('G').toMidiNote(), 192, 8);
			player.addNote(new Pitch('E').transpose(12).toMidiNote(), 200, 8);
			player.addNote(new Pitch('G').transpose(12).toMidiNote(), 208, 8);

			player.addNote(new Pitch('A').transpose(12).toMidiNote(), 216, 12);
			player.addNote(new Pitch('F').transpose(12).toMidiNote(), 228, 6);
			player.addNote(new Pitch('G').transpose(12).toMidiNote(), 234, 6);

			player.addNote(new Pitch('E').transpose(12).toMidiNote(), 246, 12);
			player.addNote(new Pitch('C').transpose(12).toMidiNote(), 258, 6);
			player.addNote(new Pitch('D').transpose(12).toMidiNote(), 264, 6);
			player.addNote(new Pitch('B').toMidiNote(), 270, 6);

			System.out.println(player);

			player.play();
			Thread.sleep(10000);

		} catch (MidiUnavailableException midiUe) {
			midiUe.printStackTrace();
		} catch (InvalidMidiDataException invalidMidiDe) {
			invalidMidiDe.printStackTrace();
		} catch (InterruptedException intEx) {
			intEx.printStackTrace();
		}
	}

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
					player.addNote(n.getPitch(), n.getStartTick(), n.getNumTicks());
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
