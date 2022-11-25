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
import abc.parser.AbcBaseListener;
import abc.parser.AbcLexer;
import abc.parser.AbcParser;
import abc.parser.NoteListener;

public class SequencePlayerTest {

	// TODO: warmup #2

	@Test
	public void test() {
		String fileName = "sample_abc/piece2.abc";
		try {
			CharStream input = fromFileName(fileName);
			AbcLexer lexer = new AbcLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			AbcParser parser = new AbcParser(tokens);
			ParseTree tree = parser.abc_tune();
			// TODO: Implement custom walker, parse tree into POJO, play notes using SquencePlayer
			ParseTreeWalker walker = new ParseTreeWalker();
			NoteListener l = new NoteListener();
			walker.walk(l, tree);
			
			Music m = l.getMusic();
//			SequencePlayer player = new SequencePlayer(m.getTempo(), m.getMeter());
			SequencePlayer player = new SequencePlayer(120, 2);
			int i = 0;
			for(Note n: m.getNotes()) {
				player.addNote(n.getNote(), i++, 1);
			}
			System.out.println(player);
			player.play();
			System.out.println("DONE");
			Thread.sleep(2000);
		} catch (InterruptedException|IOException|MidiUnavailableException|InvalidMidiDataException e) {
			e.printStackTrace();
		}
	}
		
	@Test
	public void blah() {
		SequencePlayer player;
		try {
			player = new SequencePlayer(120, 2);
			
	        player.addNote(new Pitch('C').toMidiNote(), 0, 1);
	        player.addNote(new Pitch('D').toMidiNote(), 1, 1);
	        player.addNote(new Pitch('E').toMidiNote(), 2, 1);
	        player.addNote(new Pitch('F').toMidiNote(), 3, 1);
	        player.addNote(new Pitch('G').toMidiNote(), 4, 1);
	        player.addNote(new Pitch('A').toMidiNote(), 5, 1);
	        player.addNote(new Pitch('B').toMidiNote(), 6, 1);
	        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 7, 1);
	        player.addNote(new Pitch('B').toMidiNote(), 8, 1);
	        player.addNote(new Pitch('A').toMidiNote(), 9, 1);
	        player.addNote(new Pitch('G').toMidiNote(), 10, 1);
	        player.addNote(new Pitch('F').toMidiNote(), 11, 1);
	        player.addNote(new Pitch('E').toMidiNote(), 12, 1);
	        player.addNote(new Pitch('D').toMidiNote(), 13, 1);
	        player.addNote(new Pitch('C').toMidiNote(), 14, 1);

	        System.out.println(player);

	        // play!
	        player.play();
	        
	        Thread.sleep(1000);
		} catch (InterruptedException | MidiUnavailableException | InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
