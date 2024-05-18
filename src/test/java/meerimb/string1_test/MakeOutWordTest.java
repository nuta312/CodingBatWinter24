package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {
    MakeOutWord makeOutWord = new MakeOutWord();

    @Test(dataProvider = "makeOutWord")
    public void testMakeOutWord(String out, String word, String expected) {

        Assert.assertEquals(makeOutWord.makeOutWord(out, word), expected);
    }

    @DataProvider(name = "makeOutWord")
    public Object[][] makeOutWord() {
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},
                {"HHoo", "Hello", "HHHellooo"},
                {"abyz", "YAY", "abYAYyz"},
        };
    }
}
