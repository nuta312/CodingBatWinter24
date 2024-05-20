package dzhamilya.string1_test;

import com.digital_nomads.dzhamilya.string1.ComboString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboStringTest {
    @Test(dataProvider = "StringTest")
    public void testComboString (String a, String b, String expected) {
        ComboString combo = new ComboString();
        String result = combo.comboString(a, b);
        Assert.assertEquals(result, expected);
    }
@DataProvider
    public Object [][] StringTest() {
      return new Object[][] {
              {"Hello", "hi", "hiHellohi"},
              {"hi", "Hello" , "hiHellohi"},
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
