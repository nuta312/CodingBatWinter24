package aijan.string1_test;

import com.digital_nomads.aijan.string1.WithoutX;
import com.digital_nomads.aijan.string1.WithoutX2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WithoutX2Test {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"xHi", "Hi"},
                {"Hxi", "Hi"},
                {"Hi", "Hi"},
                {"xxHi", "Hi"},
                {"Hix", "Hix"},
                {"xaxb", "axb"},
                {"xx", ""},
                {"x", ""},
                {"", ""},
                {"Hello", "Hello"},
                {"Hexllo", "Hexllo"},
                {"xHxllo", "Hxllo"}
        };
    }

    @Test(dataProvider = "word")
    public void testWithoutX2(String str, String expectedResult) {
        WithoutX2 obj = new WithoutX2();
        String actualResult = obj.withoutX2(str);
        Assert.assertEquals(actualResult,expectedResult);
    }


}