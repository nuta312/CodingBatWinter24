package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.HasBad;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasBadTest {

    @Test(dataProvider = "hasBadDataProvider")
    public void hasBadTest(String str, boolean expected){
        HasBad hasBad = new HasBad();
        Assert.assertEquals(hasBad.hasBad(str), expected);
    }

    @DataProvider(name = "hasBadDataProvider")
    public Object[][] hasBadDataProvider() {
        return new Object[][]{
                {"badxx", true},
                {"xbadxx", true},
                {"xxbadxx", false},
                {"code", false},
                {"bad", true},
                {"ba", false},
                {"xba", false},
                {"xbad", true},
                {"", false},
                {"badxx", true},
                {"badyy", true}
        };
    }
}
