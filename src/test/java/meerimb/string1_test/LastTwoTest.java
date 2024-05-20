package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.LastTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastTwoTest {

    LastTwo lastTwo = new LastTwo();

    @Test(dataProvider = "lastTwo")
    public void testLastTwo(String a, String expected) {

        Assert.assertEquals(lastTwo.lastTwo(a), expected);
    }

    @DataProvider
    public Object[][] lastTwo() {
        return new Object[][]{
                {"coding", "codign"},
                {"cat", "cta"},
                {"ab", "ba"},
                {"a", "a"},
                {"", ""},
        };
    }
}
