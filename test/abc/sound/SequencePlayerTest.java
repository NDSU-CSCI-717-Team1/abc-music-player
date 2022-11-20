package abc.sound;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import abc.parser.AbcBaseListener;
import abc.parser.AbcLexer;
import abc.parser.AbcParser;

public class SequencePlayerTest {

	// TODO: warmup #2

	@Test
	public void test() {
		String fileName = "sample_abc/piece1.abc";
		try {
			CharStream input = fromFileName(fileName);
			AbcLexer lexer = new AbcLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			AbcParser parser = new AbcParser(tokens);
			ParseTree tree = parser.abc_tune();
			// TODO: Implement custom walker, parse tree into POJO, play notes using SquencePlayer
			ParseTreeWalker walker = new ParseTreeWalker();
			AbcBaseListener listener = new AbcBaseListener();
			walker.walk(listener, tree);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
