package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.StartWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartWordTest {

    @Test(dataProvider = "startWordDataProvider")
    public void  startWordTest(String a, String b, String expected) {
        StartWord startWord = new StartWord();
        Assert.assertEquals(startWord.startWord(a,b),expected);
    }

    @DataProvider(name = "startWordDataProvider")
    public Object[][] startWordDataProvider(){
        return new Object[][]{
                {"hippo", "hi", "hi"},
                {"hippo", "xip", "hip"},
                {"hippo", "i", "h"},
                {"hippo", "ix",  ""},
                {"h", "ix", ""},
                {"", "i", ""},
                {"hip", "zi", "hi"},
                {"hip", "zip", "hip"},
                {"hip", "zig", ""}
        };
    }

}
