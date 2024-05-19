package aijan.string1_test;

import com.digital_nomads.aijan.string1.DeFront;
import com.digital_nomads.aijan.string1.MinCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DeFrontTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"Hello", "llo"},
                {"java","va"},
                {"away", "aay"},
                {"axy", "ay"},
                {"abc", "abc"},
                {"xby", "by"},
                {"ab", "ab"},
                {"ax", "a"},
                {"axb", "ab"},
                {"aaa", "aa"},
                {"xbc", "bc"},
                {"bbb", "bb"},
                {"bazz", "zz"},
                {"ba", ""},
                {"abxyz", "abxyz"},
                {"hi", ""},
                {"his", "s"},
                {"xz", ""},
                {"zzz", "z"},
        };
    }

    @Test(dataProvider = "word")
    public void testDeFront(String str, String expectedResult) {
        DeFront obj = new DeFront();
        String actualResult = obj.deFront(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
}