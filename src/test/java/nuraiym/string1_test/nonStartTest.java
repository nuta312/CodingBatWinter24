package nuraiym.string1_test;

import com.digital_nomads.nuraiym.string1.nonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class nonStartTest {
    @Test(dataProvider = "nonStart")
    public void testNonStart(String a, String b, String expected) {
        nonStart nonStart = new nonStart();
        String result = nonStart.nonStart(a, b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "nonStart")
    public Object[][] nonStartDataProvider() {
        return new Object[][]{
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
