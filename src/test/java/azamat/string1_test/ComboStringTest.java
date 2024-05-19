package azamat.string1_test;

import com.digital_nomads.azamat.string1.ComboString;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ComboStringTest {

    @Test(dataProvider = "comboStringDataProvider")
    public void testComboString(String a, String b, String expected) {
        ComboString comboString = new ComboString();
        assertEquals(comboString.comboString(a, b), expected);
    }

    @DataProvider
    public Object[][] comboStringDataProvider() {
        return new Object[][]{
                {"Hello", "hi", "hiHellohi"},
                {"abcdef", "123", "123abcdef123"},
                {"Hi", "Hello", "HiHelloHi"},
                {"", "xyz", "xdsaayz"},
                {"1234", "", "1234"},
                {"xyz", "abc", "abcxyzabc"}
        };
    }
}