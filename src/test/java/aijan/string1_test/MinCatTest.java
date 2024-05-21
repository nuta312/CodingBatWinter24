package aijan.string1_test;

import com.digital_nomads.aijan.string1.FrontAgain;
import com.digital_nomads.aijan.string1.MinCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MinCatTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"Hello", "Hi", "loHi"},
                {"Hello", "java", "ellojava"},
                {"java", "Hello", "javaello"},
                {"abc", "x", "cx"},
                {"x", "abc", "xc"},
                {"abc", "", ""},
        };
    }

    @Test(dataProvider = "word")
    public void testMinCat(String a, String b, String expectedResult) {
        MinCat obj = new MinCat();
        String actualResult = obj.minCat(a, b);
        Assert.assertEquals(actualResult,expectedResult);
    }


}