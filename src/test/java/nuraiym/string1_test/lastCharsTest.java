package nuraiym.string1_test;

import com.digital_nomads.nuraiym.string1.lastChars;
import com.digital_nomads.nuraiym.string1.lastChars;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class lastCharsTest {
    @Test(dataProvider = "lastCharsDataProvider")
    public void testLastChars(String a, String b, String expected) {
        lastChars lastChars = new lastChars();
        String result = lastChars.lastChars(a, b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "lastCharsDataProvider")
    public Object[][] lastCharsDataProvider() {
        return new Object[][]{
                {"last", "chars", "ls"},
                {"yo", "java", "ya"},
                {"hi", "", "h@"},
                {"", "hello", "@o"},
                {"", "", "@@"},
                {"kitten", "hi", "ki"},
                {"k", "zip", "kp"},
                {"kitten", "", "k@"},
                {"kitten", "zip", "kp"}
        };
    }
}
