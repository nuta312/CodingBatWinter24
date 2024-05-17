package aijan.string1_test;

import com.digital_nomads.aijan.string1.LastChars;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LastCharsTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"last", "chars", "ls"},
                {"yo", "java", "ya"},
                {"hi", "", "h@"},
                {"", "hello", "@o"},
                {"", "", "@@"},
                {"k", "zip", "kp"},
                {"kitten", "", "k@"},
                {"kitten", "zip", "kp"},
                {"kitten", "hi","ki"}
        };

    }

    @Test(dataProvider = "word")
    public void testLastChars(String a, String b, String expectedResult) {
        LastChars obj = new LastChars();
        String actualResult = obj.lastChars(a,b);
        Assert.assertEquals(actualResult,expectedResult);
    }



}