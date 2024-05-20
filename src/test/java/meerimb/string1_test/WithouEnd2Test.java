package meerimb.string1_test;


import com.digital_nomads.meerimb.string1.WithouEnd2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithouEnd2Test {
    WithouEnd2 withoutEnd2 = new WithouEnd2();

    @Test(dataProvider = "wihoutEnd2")
    public void testWithouEnd2(String str, String expected) {

        Assert.assertEquals(withoutEnd2.withouEnd2(str), expected);
    }

    @DataProvider
    public Object[][] wihoutEnd2() {
        return new Object[][]{
                {"Hello", "ell"},
                {"abc", "b"},
                {"a", ""},
                {"", ""},
                {"coldy", "old"},
                {"java code", "ava cod"},
        };
    }
}
