package meka.string1_test;

import com.digital_nomads.meka.string1.WithoutX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutXTest {

    @Test(dataProvider = "testData")
    public void testWithoutX(String str, String expected) {
        WithoutX withoutX = new WithoutX();
        String result = withoutX.withoutX(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"xHix", "Hi"},
                {"xHi", "Hi"},
                {"Hxix", "Hxi"},
                {"Hi", "Hi"},
                {"x", ""},
                {"xx", ""},
                {"", ""},
                {"Hello", "Hello"}
        };
    }
}
