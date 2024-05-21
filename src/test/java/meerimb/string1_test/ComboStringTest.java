package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.ComboString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboStringTest {

    ComboString comboString = new ComboString();

    @Test(dataProvider = "comboString")
    public void testComboString(String a, String b, String expected) {

        Assert.assertEquals(comboString.comboString(a, b), expected);
    }

    @DataProvider(name = "comboString")
    public Object[][] comboString() {
        return new Object[][]{
                {"Hello", "hi", "hiHellohi"},
                {"hi", "Hello", "hiHellohi"},
                {"aaa", "b", "baaab"},
                {"aaa", "", "aaa"},
                {"", "bb", "bb"},
                {"aaa", "1234", "aaa1234aaa"},
                {"aaa", "bb", "bbaaabb"},
                {"a", "bb", "abba"},
                {"bb", "a", "abba"},
                {"xyz", "ab", "abxyzab"},
        };
    }
}
