import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        cspsharpLexer lex = new cspsharpLexer(new ANTLRFileStream("G:\\workspace\\PAT\\grammar\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        cspsharpParser g = new cspsharpParser(tokens, 49100, null);
        try {
            g.statement();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}