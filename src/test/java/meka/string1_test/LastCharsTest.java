package meka.string1_test;

import com.digital_nomads.meka.string1.LastChars;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastCharsTest {

    @Test(dataProvider = "testData")
    public void testLastChars(String a, String b, String expected) {
        LastChars lastChars = new LastChars();
        String result = lastChars.lastChars(a, b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
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
