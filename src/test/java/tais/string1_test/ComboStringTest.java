package tais.string1_test;

import com.digital_nomads.tais.string1.ComboString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboStringTest {

    @Test(dataProvider = "dPcomboStringTest")
    public void comboStringTest(String str1, String str2, String expected){

        ComboString objComboString = new ComboString();
        Assert.assertEquals(objComboString.comboString(str1, str2), expected);
    }

    @DataProvider
    public Object[][] dPcomboStringTest(){
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



}
