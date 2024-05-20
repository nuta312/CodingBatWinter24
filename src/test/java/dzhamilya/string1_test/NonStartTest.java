package dzhamilya.string1_test;

import com.digital_nomads.dzhamilya.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NonStartTest {
    @Test(dataProvider = "startTest")
    public void testNonStart(String a, String b, String expected){
        NonStart non = new NonStart();
        String result = non.nonStart(a, b);
        Assert.assertEquals(result, expected);
    }
    @DataProvider
    public Object[][] startTest() {
        return new Object[][] {
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
