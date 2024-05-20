package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.DeFront;
import com.digital_nomads.zafura.string1.StartWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartWordTest {
    @Test(dataProvider = "word")
    public void testStartWord(String str,String word,  String expected) {
        StartWord startWord = new StartWord();
        Assert.assertEquals(startWord.startWord(str,word), expected);
    }

    @DataProvider
    public Object[][] word() {

        return new Object[][]{
                {"hippo", "hi","hi"},
                {"hippo", "i", "h"},
                {"h", "z","h"},
        };
    }
}


