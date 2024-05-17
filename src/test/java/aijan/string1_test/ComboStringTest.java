package aijan.string1_test;

import com.digital_nomads.aijan.string1.ComboString;
import com.digital_nomads.aijan.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboStringTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
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

    @Test(dataProvider = "word")
    public void testComboString(String a, String b, String expectedResult) {
        ComboString obj = new ComboString();
        String actualResult = obj.comboString(a, b);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
