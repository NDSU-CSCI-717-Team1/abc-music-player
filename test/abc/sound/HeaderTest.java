package abc.sound;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import abc.parser.AbcGrammar;
import abc.parser.HeaderParser;
import lib6005.parser.GrammarCompiler;
import lib6005.parser.ParseTree;
import lib6005.parser.Parser;
import lib6005.parser.UnableToParseException;

/*
 * This contains the TestCases for testing the Headers in the ABC music files
 */
public class HeaderTest {

	private static File abcNotationGrammarFile = new File("src/abc/parser/AbcNotations.g");

	@Test
	public void testVoicesInHeader() throws UnableToParseException, IOException {
		File musicFile = new File("sample_abc/fur_elise.abc");
		Parser<AbcGrammar> headerParser = GrammarCompiler.compile(abcNotationGrammarFile, AbcGrammar.ROOT);
		ParseTree<AbcGrammar> headerTree = headerParser.parse(musicFile);
		Header header = HeaderParser.buildHeader(headerTree);
		assertEquals("Expected number of voices", 2, header.getVoices().keySet().size());
		assertTrue("Expected voice in voices", header.getVoices().containsKey("1"));
		assertTrue("Expected voice in voices", header.getVoices().containsKey("2"));
	}

	@Test
	public void testEverythingPresentInHeader() throws UnableToParseException, IOException {
		File musicFile = new File("sample_abc/piece1.abc");
		Parser<AbcGrammar> headerParser = GrammarCompiler.compile(abcNotationGrammarFile, AbcGrammar.ROOT);
		ParseTree<AbcGrammar> headerTree = headerParser.parse(musicFile);
		Header header = HeaderParser.buildHeader(headerTree);
		assertEquals("Expected index", "1", header.getIndex());
		assertEquals("Expected title", "Piece No.1", header.getTitle());
		assertTrue("Expected key", header.getKey().equals("C") || header.getKey().equals("Am"));
		assertEquals("Expected default length", "1/4", header.getLength());
		assertEquals("Expected default tempo", "1/4", header.getTempoBaseNote());
		assertEquals("Expected correct tempo", 140, header.getTempoBPM());
		assertTrue("Expected correct meter", header.getMeter().equals("4/4") || header.getMeter().equals("C"));

	}

}
