package aizada.string1_test;

import com.digital_nomads.aizada.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {
    @Test(dataProvider = "TestMakeOutWord")
    public void makeOutWordTest (String out, String word, String expected){
        MakeOutWord makeOutWord = new MakeOutWord();
        Assert.assertEquals(makeOutWord.makeOutWord(out, word), expected);
    }

    @DataProvider(name = "TestMakeOutWord")
    public Object[][] makeOutWord () {
        return new Object [][] {
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},
                {"HHoo", "Hello", "HHHellooo"},
                {"abyz", "YAY", "abYAYyz"}
        };
    }
}
