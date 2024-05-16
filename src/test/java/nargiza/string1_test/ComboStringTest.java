package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.ComboString;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ComboStringTest {

    ComboString comboString = new ComboString();

    @DataProvider(name = "getComboString")
    public Object[][] getComboString(){
        return new Object[][]{
                {"Hello", "hi", "hiHellohi"},
                {"hi", "Hello", "hiHellohi"},
                {"aaa", "b", "baaab"}
        };
    }

    @Test(dataProvider = "getComboString")
    public void getComboString(String a, String b, String expected){
        String result = comboString.comboString(a, b);
assertEquals(result, expected);
    }

}