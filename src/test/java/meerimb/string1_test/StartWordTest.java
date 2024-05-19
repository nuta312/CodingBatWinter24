package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.StartWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartWordTest {


    StartWord startWord = new StartWord();

    @Test(dataProvider = "startWord")
    public void testStartWord(String str, String word, String expected) {

        Assert.assertEquals(startWord.startWord(str, word), expected);
    }

    @DataProvider
    public Object[][] startWord() {
        return new Object[][]{
                {"hippo", "hi", "hi"},
                {"hippo", "hip", "hip"},
                {"hippo", "i", "h"},
                {"hippo", "ix", ""},
                {"", "i", ""},
                {"hip", "hi", "hi"},
                {"hippo", "zip", "hip"},
                {"hip", "zig", ""},
                {"h", "z", "h"},
                {"hippo", "xippo", "hippo"},
                {"hippo", "xyz", ""},
                {"hippo", "hip", "hip"},
                {"kitten", "cit", "kit"},
                {"kit", "cit", "kit"}
        };
    }
}
