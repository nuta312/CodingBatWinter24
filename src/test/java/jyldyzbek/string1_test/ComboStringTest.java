package jyldyzbek.string1_test;

import com.digital_nomads.jyldyzbek.string1.ComboString;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboStringTest {

    @Test(dataProvider = "comboString")
    public void comboStringTestMethod(String str, String str1, String ab) {
        ComboString comboString = new ComboString();
        String result = comboString.comboString(str, str1);
        assert result.equals(ab);

    }

    @DataProvider
    public Object[][] comboString() {
        return new Object[][]{
                {"Hello", "hi", "hiHellohi"},
                {"hi", "Hello", "hiHellohi"},
                {"aaa", "", "aaa"},
                {"aaa", "1234", "aaa1234aaa"},
                {"xyz", "ab", "abxyzab"},
                {"aaa", "bb", "bbaaabb"},
                {"b", "aaa", "baaab"},
        };
    }
}