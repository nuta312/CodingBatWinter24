package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.LastChars;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastCharsTest {

    LastChars lastChars = new LastChars();

    @Test(dataProvider = "lastChars")
    public void testLastChars(String a, String b, String expected) {

        Assert.assertEquals(lastChars.lastChars(a, b), expected);
    }

    @DataProvider
    public Object[][] lastChars() {
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
