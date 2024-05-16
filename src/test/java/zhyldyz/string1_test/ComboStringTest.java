package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.ComboString;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ComboStringTest {

    @Test(dataProvider = "comboStringDataProvider")
    public void comboStringTest(String a, String b, String expected) {

        ComboString comboString = new ComboString();
        assertEquals(comboString.comboString(a, b), expected);

    }

    @DataProvider(name = "comboStringDataProvider")
    public String[][] comboStringDataProvider() {
        return new String[][]{

                {"hi", "Hello", "hiHellohi"},
                {"aaa", "b", "baaab"},
                {"b", "aaa", "baaab"},
                {"aaa", "", "aaa"},
                {"", "bb", "bb"},
                {"aaa", "1234", "aaa1234aaa"}
        };

    }

}