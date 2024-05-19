package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.Without2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Without2Test {

    Without2 without2 = new Without2();

    @Test(dataProvider = "without2")
    public void testWithout2(String str, String expected) {

        Assert.assertEquals(without2.without2(str), expected);
    }

    @DataProvider
    public Object[][] without2() {
        return new Object[][]{
                {"HelloHe", "lloHe"},
                {"HelloHi", "HelloHi"},
                {"Hi", ""},
                {"Chocolate", "Chocolate"},
                {"xxx", "x"},
                {"x", "x"},
                {"", ""},
                {"Fruits", "Fruits"},
        };
    }
}
