package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {

    MakeOutWord makeOutWord = new MakeOutWord();

    @DataProvider(name = "tagMakeOutWordTest")
    public Object[][] tagMakeOutWordTest(){
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"}
        };
    }

    @Test(dataProvider = "tagMakeOutWordTest")
    public void testMakeOutWordTest(String out, String word, String expected){
        String result = makeOutWord.makeOutWord(out, word);
        Assert.assertEquals(result, expected);
    }
}
