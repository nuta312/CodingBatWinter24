package meka.string1_test;

import com.digital_nomads.meka.string1.MinCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinCatTest {

    @Test(dataProvider = "testData")
    public void testMinCat(String a, String b, String expected) {
        MinCat minCat = new MinCat();
        String result = minCat.minCat(a, b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"Hello", "Hi", "loHi"},
                {"Hello", "java", "ellojava"},
                {"java", "Hello", "javaello"},
                {"abc", "x", "cx"},
                {"x", "abc", "xc"},
                {"abc", "", ""}
        };
    }
}
