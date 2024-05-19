package aima.string1_test;

import com.digital_nomads.aima.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NonStartTest {
    @Test(dataProvider = "words")
    public void nonStart(String a, String b, String expected) {
        NonStart nonStart = new NonStart();
        Assert.assertEquals(nonStart.nonStart(a, b), expected);
    }

    @DataProvider(name = "words")
    public Object[][] provideWords() {
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