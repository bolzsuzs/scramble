package zsuzs;

import org.junit.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {
    private Main main;
    private final ByteArrayOutputStream content = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @Test
    public void testReverseWord() throws Exception {
        String str = "moment";
        String str2 = "mnemot";
        assert (main.reverseWord(str.toCharArray()) == str2.toCharArray());
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(content));
    }

    @Test
    public void testMakeReverseSentence() throws Exception {
        String separator = System.getProperty("line.separator");
        String res = "to sfilpmiy the pelborm of snilbmarcg it wluod not use rodnam oedrr";
        assert ((res + separator).equals(content.toString()));
    }
}
