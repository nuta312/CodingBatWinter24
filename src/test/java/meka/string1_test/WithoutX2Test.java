package meka.string1_test;

import com.digital_nomads.meka.string1.WithoutX2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutX2Test {

    @Test(dataProvider = "testData")
    public void testWithoutX2(String str, String expected) {
        WithoutX2 withoutX2 = new WithoutX2();
        String result = withoutX2.withoutX2(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"xxHi", "Hi"},
                {"xHi", "Hi"},
                {"Hxi", "Hi"},
                {"Hi", "Hi"},
                {"x", ""},
                {"xx", ""},
                {"", ""},
                {"Hexllo", "Hexllo"},
                {"Hello", "Hello"}
        };
    }
}
