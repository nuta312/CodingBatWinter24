package meka.string1_test;

import com.digital_nomads.meka.string1.ComboString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboStringTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"Hello", "hi", "hiHellohi"},
                {"hi", "Hello", "hiHellohi"},
                {"aaa", "b", "baaab"},
                {"b", "aaa", "baaab"},
                {"aaa", "", "aaa"},
                {"", "bb", "bb"},
                {"aaa", "1234", "aaa1234aaa"},
                {"aaa", "bb", "bbaaabb"},
                {"a", "bb", "abba"},
                {"bb", "a", "abba"},
                {"xyz", "ab", "abxyzab"}
        };
    }

    @Test(dataProvider = "testData")
    public void testComboString(String a, String b, String expected) {
        ComboString comboString = new ComboString();
        String result = comboString.comboString(a, b);
        Assert.assertEquals(result, expected);
    }

}
