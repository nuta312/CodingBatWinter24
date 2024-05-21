package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.ComboString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboStringTest {

    @Test(dataProvider = "comboProvider")
    public void testComboString(String a, String b , String expected){
        Assert.assertEquals(ComboString.comboString(a, b), expected);
    }

    @DataProvider
    public Object[][] comboProvider(){
        return new Object[][]{
                {"Hello", "hi", "hiHellohi"},
                {"hi", "Hello","hiHellohi"},
                {"aaa", "", "aaa"},
                {"aaa", "1234", "aaa1234aaa"},
                {"bb", "a", "abba"}

        };
    }
}
