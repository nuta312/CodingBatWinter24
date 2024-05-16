package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.MakeOutWord;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MakeOutWordTest {

    @Test(dataProvider = "makeOutWordDataProvider")
    public void makeOutWord(String out, String word, String expected) {

        var makeOutWord = new MakeOutWord();
        assertEquals(makeOutWord.makeOutWord(out, word), expected);

    }

    @DataProvider(name = "makeOutWordDataProvider")
    public String[][] makeOutWordDataProvider() {
        return new String[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},
                {"HHoo", "Hello", "HHHellooo"},
                {"abyz", "YAY", "abYAYyz"}
        };
    }

}