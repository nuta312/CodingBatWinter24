package meka.string1_test;

import com.digital_nomads.meka.string1.Without2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Without2Test {

    @Test(dataProvider = "testData")
    public void testWithout2(String str, String expected) {
        Without2 without2 = new Without2();
        String result = without2.without2(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"HelloHe", "lloHe"},
                {"HelloHi", "HelloHi"},
                {"Hi", ""},
                {"Chocolate", "Chocolate"},
                {"xxx", "x"},
                {"xx", ""},
                {"x", "x"},
                {"", ""},
                {"Fruits", "Fruits"}
        };
    }
}
