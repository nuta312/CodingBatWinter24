package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.MinCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinCatTest {

    MinCat minCat = new MinCat();

    @Test(dataProvider = "minCat")
    public void testMinCat(String a, String b, String expected) {

        Assert.assertEquals(minCat.minCat(a, b), expected);
    }

    @DataProvider
    public Object[][] minCat() {
        return new Object[][]{
                {"Hello", "Hi", "loHi"},
                {"Hello", "java", "ellojava"},
                {"java", "Hello", "javaello"},
                {"abc", "x", "cx"},
                {"x", "abc", "xc"},
                {"abc", "", ""},
        };
    }
}
