package aijan.string1_test;

import com.digital_nomads.aijan.string1.MinCat;
import com.digital_nomads.aijan.string1.Without2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Without2Test {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"HelloHe",  "lloHe"},
                {"HelloHi", "HelloHi"},
                {"Hi", ""},
                {"Chocolate", "Chocolate"},
                {"xx", ""},
                {"x", "x"},
                {"", ""},
                {"Fruits", "Fruits"},
        };
    }

    @Test(dataProvider = "word")
    public void testWithout2(String str, String expectedResult) {
        Without2 obj = new Without2();
        String actualResult = obj.without2(str);
        Assert.assertEquals(actualResult,expectedResult);
    }


}