package meka.string1_test;

import com.digital_nomads.meka.string1.HasBad;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasBadTest {
    @Test(dataProvider = "testData")
    public void testHasBad(String str, boolean expected) {
        HasBad hasBad = new HasBad();
        boolean result = hasBad.hasBad(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"badxx", true},
                {"xbadxx", true},
                {"xxbadxx", false},
                {"code", false},
                {"bad", true},
                {"ba", false},
                {"xba", false},
                {"xbad", true},
                {"", false},
                {"badyy", true},
        };
    }
}
