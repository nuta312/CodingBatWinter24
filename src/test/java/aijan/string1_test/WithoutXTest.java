package aijan.string1_test;

import com.digital_nomads.aijan.string1.MinCat;
import com.digital_nomads.aijan.string1.WithoutX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WithoutXTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"xHix", "Hi"},
                {"xHi", "Hi"},
                {"Hxix", "Hxi"},
                {"Hi", "Hi"},
                {"xxHi", "xHi"},
                {"Hix", "Hi"},
                {"xaxbx", "axb"},
                {"xx", ""},
                {"x", ""},
                {"", ""},
                {"Hello", "Hello"},
                {"Hexllo", "Hexllo"},
        };
    }

    @Test(dataProvider = "word")
    public void testWithoutX(String str, String expectedResult) {
        WithoutX obj = new WithoutX();
        String actualResult = obj.withoutX(str);
        Assert.assertEquals(actualResult,expectedResult);
    }


}