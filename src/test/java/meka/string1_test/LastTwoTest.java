package meka.string1_test;

import com.digital_nomads.meka.string1.LastTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastTwoTest {

    @Test(dataProvider = "testData")
    public void testLastTwo(String str, String expected) {
        LastTwo lastTwo = new LastTwo();
        String result = lastTwo.lastTwo(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"coding", "codign"},
                {"cat", "cta"},
                {"ab", "ba"},
                {"a", "a"},
                {"", ""}
        };
    }
}
