package meka.string1_test;

import com.digital_nomads.meka.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NonStartTest {

    @Test(dataProvider = "testData")
    public void testNonStart(String a, String b, String expected) {
        NonStart nonStart = new NonStart();
        String result = nonStart.nonStart(a, b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"Hello", "There", "ellohere"},
                {"java", "code", "avaode"},
                {"shotl", "java", "hotlava"},
                {"ab", "xy", "by"},
                {"ab", "x", "b"},
                {"x", "ac", "c"},
                {"a", "x", ""},
                {"kit", "kat", "itat"},
                {"mart", "dart", "artart"}
        };
    }
}
