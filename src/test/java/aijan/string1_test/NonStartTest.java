package aijan.string1_test;

import com.digital_nomads.aijan.string1.ComboString;
import com.digital_nomads.aijan.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NonStartTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"Hello", "There","ellohere"},
                {"java", "code", "avaode"},
                {"shotl", "java", "hotlava"},
                {"ab", "xy", "by"},
                {"ab", "x", "b"},
                {"x", "ac", "c"},
                {"a", "x", ""},
                {"kit", "kat", "itat"},
                {"mart", "dart", "artart"},

        };

    }

    @Test(dataProvider = "word")
    public void testNonStart(String a, String b, String expectedResult) {
        NonStart obj = new NonStart();
        String actualResult = obj.nonStart(a, b);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
