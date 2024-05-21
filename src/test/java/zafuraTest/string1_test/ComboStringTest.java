package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.ComboString;
import com.digital_nomads.zafura.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboStringTest {
    @Test(dataProvider = "combo")
    public void testComboString(String a,String b, String expected) {
        ComboString comboString = new ComboString();
        Assert.assertEquals(comboString.comboString(a,b),expected);
    }
    @DataProvider
    public Object[][]combo(){
        return new Object[][]{
                {"Hello", "hi","hiHellohi"},
                {"hi", "Hello","hiHellohi" },
                {"aaa", "b", "baaab"},
                {"b", "aaa", "baaab"},
                {"aaa", "", "aaa"},

        };
    }
}
