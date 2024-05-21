package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.LastChars;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastCharsTest {

    @Test(dataProvider = "lastCharsDataProvider")
    public void  lastCharsTest(String a, String b, String expected) {
        LastChars lastChars = new LastChars();
        Assert.assertEquals(lastChars.lastChars(a,b),expected);
    }

    @DataProvider(name = "lastCharsDataProvider")
    public Object[][] lastCharsDataProvider(){
        return new Object[][]{
                {"last", "chars", "ls"},
                {"yo", "java", "ya"},
                {"hi", "", "h@"},
                {"", "hello",  "@o"},
                {"", "", "@@"},
                {"kitten", "hi", "ki"},
                {"k", "zip", "kp"},
                {"kitten", "", "k@"},
                {"kitten", "zip", "kp"}
        };
    }
}
