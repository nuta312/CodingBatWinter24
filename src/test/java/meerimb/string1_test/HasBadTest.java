package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.HasBad;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasBadTest {

    HasBad hasBad = new HasBad();

    @Test(dataProvider = "hasBad")
    public void testHasBed(String str, boolean expected) {

        Assert.assertEquals(hasBad.hasBad(str), expected);
    }

    @DataProvider
    public Object[][] hasBad() {
        return new Object[][]{
                {"badxx", true},
                {"xbadxx", true},
                {"xxbadxx", false},
                {"code", false},
                {"ba", false},
                {"xba", false},
                {"xbad", true},
                {"", false},
                {"baddyy", true},
        };
    }
}
