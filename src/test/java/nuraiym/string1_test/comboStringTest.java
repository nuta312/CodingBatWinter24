package nuraiym.string1_test;

import com.digital_nomads.nuraiym.string1.comboString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class comboStringTest {
    @Test(dataProvider = "comboString")
    public void testComboString(String a, String b, String expected) {
        comboString comboString = new comboString();
        String result = comboString.comboString(a, b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "comboString")
    public Object[][] comboStringDataProvider() {
        return new Object[][]{
                {"Hello", "hi", "hiHellohi"},
                {"hi", "Hello", "hiHellohi"},
                {"aaa", "b", "baaab"},
                {"b", "aaa", "baaab"},
                {"abc", "defgh", "abcdefghabc"},
                {"", "Hello", "Hello"},
                {"Hello", "", "Hello"}
        };
    }
}
