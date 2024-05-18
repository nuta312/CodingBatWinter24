package meerimMac.string1;

import com.digital_nomads.MeerimMac.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"<<>>", "he", "<<he>>"},
                {"[[]]", "hi", "[[hi]]"},


        };

    }


    @Test(dataProvider = "word")
    public void makeOutWordTest(String symb, String word, String exp) {
        String actual = MakeOutWord.makeOutWord(symb, word);
        Assert.assertEquals(actual, exp);

    }

}
