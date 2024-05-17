package meka.string1_test;

import com.digital_nomads.meka.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {

    @Test(dataProvider = "testData")
    public void testMakeOutWord(String out, String word, String expected) {
        MakeOutWord makeOutWord = new MakeOutWord();
        String result = makeOutWord.makeOutWord(out, word);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"HHoo", "Hello", "HHHellooo"},
                {"[[]]", "word", "[[word]]"},
                {"abyz", "YAY", "abYAYyz"}
        };
    }
}
