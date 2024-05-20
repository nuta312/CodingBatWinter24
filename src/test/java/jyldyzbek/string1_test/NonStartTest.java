package jyldyzbek.string1_test;

import com.digital_nomads.jyldyzbek.string1.NonStart;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NonStartTest {

    @Test(dataProvider = "nonStart")
    public void nonStartTest(String str, String str1, String str2) {
        NonStart nonStart = new NonStart();
        String result = nonStart.nonStart(str, str1);
        assert result.equals(str2);
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