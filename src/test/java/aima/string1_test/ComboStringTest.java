package aima.string1_test;

import com.digital_nomads.aima.string1.ComboString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboStringTest {
    @Test (dataProvider = "words")
    public void comboString (String a, String b, String expected){
        ComboString comboString = new ComboString();
        Assert.assertEquals(comboString.comboString(a, b), expected);
    }

    @DataProvider (name = "words")
    public Object[][] provideWords(){
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
                {"xyz", "ab", "abxyzab"},
        };
    }
}
