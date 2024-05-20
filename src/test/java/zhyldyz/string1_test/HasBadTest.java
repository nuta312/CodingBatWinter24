package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.HasBad;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HasBadTest {

    @Test(dataProvider = "hasBadDataProvider")
    public void hasBadTest(String str, boolean expected) {

        HasBad hasBad = new HasBad();
        assertEquals(hasBad.hasBad(str), expected);

    }

    @DataProvider(name = "hasBadDataProvider")
    public Object[][] hasBadDataProvider() {
        return new Object[][]{

                {"badxx", true},
                {"xbadxx", true},
                {"xxbadxx", false},
                {"code", false},
                {"xbad", true}
        };
    }

}