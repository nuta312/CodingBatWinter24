package aijan.string1_test;

import com.digital_nomads.aijan.string1.MinCat;
import com.digital_nomads.aijan.string1.StartWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StartWordTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"hippo", "hi", "hi"},
                {"hippo", "xip", "hip"},
                {"hippo", "i", "h"},
                {"hippo", "ix", ""},
                {"h", "ix", ""},
                {"", "i", ""},
                {"hip", "zi", "hi"},
                {"hip", "zip", "hip"},
                {"hip", "zig", ""},
                {"h", "z", "h"},
                {"hippo", "xippo", "hippo"},
                {"hippo", "xyz", ""},
                {"hippo", "hip", "hip"},
                {"kitten", "cit", "kit"},
                {"kit", "cit", "kit"},
        };
    }

    @Test(dataProvider = "word")
    public void testStartWord(String str, String word, String expectedResult) {
        StartWord obj = new StartWord();
        String actualResult = obj.startWord(str, word);
        Assert.assertEquals(actualResult,expectedResult);
    }
}