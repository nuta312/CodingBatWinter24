package almaz.string1_test;

import com.digital_nomads.almaz.string1.ComboString;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboStringTest {
    @Test(dataProvider = "ComboStringTest")
    public void testComboString(String a, String b){
        ComboString comboString = new ComboString();
    }

    @DataProvider
    public Object [][] ComboStringTest(){
        return new Object[][]{
                {"Hello", "hi"},
                {"hi", "Hello"},
                {"aaa", ""},
                {"aaa", "1234"},
                {"xyz", "ab"},
                {"aaa", "bb"},
                {"b", "aaa"},
        };
    }
}
