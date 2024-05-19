package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NonStartTest {
    NonStart nonStart = new NonStart();

    @Test(dataProvider = "nonStart")
    public void testNonStart(String a, String b, String expected) {

        Assert.assertEquals(nonStart.nonStart(a, b), expected);
    }

    @DataProvider
    public Object[][] nonStart() {
        return new Object[][]{
                {"Hello", "There", "ellohere"},
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
}
