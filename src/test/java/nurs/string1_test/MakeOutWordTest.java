package nurs.string1_test;

import com.digital_nomads.nurs.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {
    @DataProvider(name = "words")
    public Object[][] Test() {
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},
                {"HHoo", "Hello", "HHHellooo"},
                {"abyz", "YAY", "abYAYyz"},
        };
    }

    @Test(dataProvider = "words")
    public void provideWords(String out, String word, String expectedResult) {
        MakeOutWord obj = new MakeOutWord();
        String actualResult = obj.makeOutWord(out,word);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
