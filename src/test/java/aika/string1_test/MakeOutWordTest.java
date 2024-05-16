package aika.string1_test;

import com.digital_nomads.aika.string1.HelloName;
import com.digital_nomads.aika.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {
    @Test(dataProvider = "testMakeOutWordDataProvider")
    public void MakeOutWord(String out, String word, String expected) {
        MakeOutWord makeOutWord = new MakeOutWord();
        Assert.assertEquals(makeOutWord.makeOutWord(out, word), expected);
    }

    @DataProvider(name = "testMakeOutWordDataProvider")
    public Object[][] testMakeOutWordDataProvider() {
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},
                {"HHoo", "Hello", "HHHellooo"},
                {"abyz", "YAY", "abYAYyz"}};
    }
}
