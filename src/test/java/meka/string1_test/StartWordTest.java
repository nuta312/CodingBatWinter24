package meka.string1_test;

import com.digital_nomads.meka.string1.StartWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartWordTest {

    @Test(dataProvider = "testData")
    public void testStartWord(String str, String word, String expected) {
        StartWord startWord = new StartWord();
        String result = startWord.startWord(str, word);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"hippo", "hi", "hi"},
                {"hippo", "xip", "hip"},
                {"hippo", "i", "h"},
                {"hippo", "ix", ""},
                {"h", "ix", ""},
                {"", "i", ""},
                {"kitten", "cit", "kit"},
                {"kit", "cit", "kit"},
        };
    }
}
