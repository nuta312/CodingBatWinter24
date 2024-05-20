package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.MiddleTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleTwoTest {
    MiddleTwo middleTwo = new MiddleTwo();

    @Test(dataProvider = "middleTwo")
    public void testMiddleTwo(String str, String expected) {

        Assert.assertEquals(middleTwo.middleTwo(str), expected);
    }

    @DataProvider
    public Object[][] middleTwo() {
        return new Object[][]{
                {"string", "ri"},
                {"code", "od"},
                {"ab", "ab"},
                {"0123456789", "45"},
        };
    }
}
