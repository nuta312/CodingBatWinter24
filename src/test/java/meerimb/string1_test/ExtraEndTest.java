package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {
    ExtraEnd extraEnd = new ExtraEnd();

    @Test(dataProvider = "extraEnd")
    public void testExtraEnd(String str, String expected) {

        Assert.assertEquals(extraEnd.extraEnd(str), expected);
    }

    @DataProvider(name = "extraEnd")
    public Object[][] extraEnd() {
        return new Object[][]{
                {"Hello", "lololo"},
                {"ab", "ababab"},
                {"Hi", "HiHiHi"},
                {"Candy", "dydydy"},
                {"Code", "dedede"},
        };
    }
}
