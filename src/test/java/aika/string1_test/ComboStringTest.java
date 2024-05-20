package aika.string1_test;

import com.digital_nomads.aika.string1.ComboString;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ComboStringTest {
    @Test(dataProvider = "comboStringDP")
    public void testComboString(String a, String b, String except) {
        ComboString cs = new ComboString();
        assertEquals(cs.comboString(a, b), except);
    }

    @DataProvider(name = "comboStringDP")
    public String[][] comboStringDP() {
        return new String[][]{{"Hello", "hi", "hiHellohi"},
                {"hi", "Hello", "hiHellohi"},
                {"aaa", "b", "baaab"},
                {"b", "aaa", "baaab"},
                {"aaa", "", "aaa"},
                {"", "bb", "bb"},
                {"aaa", "1234", "aaa1234aaa"},
                {"aaa", "bb", "bbaaabb"},
                {"a", "bb", "abba"},
                {"bb", "a", "abba"},
                {"xyz", "ab", "abxyzab"}};
    }
}