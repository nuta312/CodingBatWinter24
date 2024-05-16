package meka.string1_test;

import com.digital_nomads.meka.string1.DeFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeFrontTest {

    @Test(dataProvider = "testData")
    public void testDeFront(String input, String expected) {
        DeFront deFront = new DeFront();
        String result = deFront.deFront(input);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"Hello", "llo"},
                {"java", "va"},
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
                {"zzz", "z"}
        };
    }
}
