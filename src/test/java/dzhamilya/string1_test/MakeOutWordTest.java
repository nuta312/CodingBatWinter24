package dzhamilya.string1_test;

import com.digital_nomads.dzhamilya.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {
    @Test(dataProvider = "wordTest")
    public void testMakeOutWord (String out, String word, String expected) {
        MakeOutWord makeout = new MakeOutWord();
        String result = makeout.makeOutWord(out, word);
        Assert.assertEquals(result, expected);

    }
@DataProvider
    public Object [][] wordTest() {
        return new Object[][] {
                {"<<>>", "Yay" , "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},
                {"HHoo", "Hello", "HHHellooo"},
                {"abyz", "YAY", "abYAYyz"},
                {"i", "i",  "<i>i</i>"},
                {"i", "", "<i></i>"},

        };
    }
}
