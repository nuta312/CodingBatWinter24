package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.NTwice;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NTwiceTest {
    NTwice nTwice = new NTwice();

    @Test(dataProvider = "nTwice")
    public void testNTwice(String str, int n, String expected) {

        Assert.assertEquals(nTwice.nTwice(str, n), expected);
    }

    @DataProvider
    public Object[][] nTwice() {
        return new Object[][]{
                {"Hello", 2, "Helo"},
                {"Chocolate", 3, "Choate"},
                {"Chocolate", 1, "Ce"},
                {"Chocolate", 0, ""},
                {"Hello", 4, "Hellello"},
                {"Code", 4, "CodeCode"},
                {"Code", 2, "Code"},
        };
    }
}
