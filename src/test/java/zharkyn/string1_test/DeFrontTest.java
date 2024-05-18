package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.DeFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeFrontTest {

    @Test(dataProvider = "deFrontDataProvider")
    public void deFrontTest(String str, String expected){
        DeFront deFront = new DeFront();
        Assert.assertEquals(deFront.deFront(str), expected);
    }

    @DataProvider(name = "deFrontDataProvider")
    public Object[][] deFrontDataProvider(){
        return new Object[][]{
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
