package almaz.string1_test;

import com.digital_nomads.almaz.string1.ComboString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboStringTest {
    @Test(dataProvider = "ComboStringTest")
    public void testComboString(String a, String b, String expect) {
        ComboString comboString = new ComboString();
        String result = comboString.comboString(a,b);
        Assert.assertEquals(result,expect);
    }

    @DataProvider
    public Object[][] ComboStringTest() {
        return new Object[][]{
                {"Hello", "hi","hiHellohi"},
                {"hi", "Hello","hiHellohi"},
                {"aaa", "","aaa"},
                {"aaa", "1234","aaa1234aaa"},
                {"xyz", "ab","abxyzab"},
                {"aaa", "bb","bbaaabb"},
                {"b", "aaa","baaab"},
        };
    }
}
