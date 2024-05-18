package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.StartWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartWordTest {

    @Test(dataProvider = "startWordProvider")
    public void testStartWord(String str, String word, String expected){
        Assert.assertEquals(StartWord.startWord(str, word), expected);
    }

    @DataProvider
    public Object[][] startWordProvider(){
        return new Object[][]{
                {"hippo", "hi", "hi"},
                {"hippo", "xip", "hip"},
                {"hippo", "i","h"},
                {"", "i", ""},
                {"hippo", "xippo", "hippo"},
        };
    }

}
