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
			// Open the input file stream
			CharStream input = fromFileName(fileName);  //load the file

			// Create a lexer that feeds off of input CharStream
			AbcLexer lexer = new AbcLexer(input);

			// Create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);

			// Create a parser that feeds off the tokens buffer
			AbcParser parser = new AbcParser(tokens);

			// Begin parsing at rule abc_tune
			ParseTree tree = parser.abc_tune();

			// Create a generic parse tree walker that can trigger callbacks
			ParseTreeWalker walker = new ParseTreeWalker();
			AbcBaseListener listener = new AbcBaseListener();
			// Walk the tree created during the parse, trigger callbacks
			walker.walk(listener, tree);
			System.out.println(); // print a \n after translation

			// Walk the tree again to translate to java
			walker.walk(listener, tree);

			// Print LISP-style tree
			// System.out.println(tree.toStringTree(parser));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
