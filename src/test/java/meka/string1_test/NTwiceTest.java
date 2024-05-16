package meka.string1_test;

import com.digital_nomads.meka.string1.NTwice;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NTwiceTest {

    @Test(dataProvider = "testData")
    public void testNTwice(String str, int n, String expected) {
        NTwice nTwice = new NTwice();
        String result = nTwice.nTwice(str, n);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"Hello", 2, "Helo"},
                {"Chocolate", 3, "Choate"},
                {"Chocolate", 1, "Ce"},
                {"Chocolate", 0, ""},
                {"Hello", 4, "Hellello"},
                {"Code", 4, "CodeCode"},
                {"Code", 2, "Code"}
        };
    }
}
