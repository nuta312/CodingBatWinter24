package aika.string1_test;

import com.digital_nomads.aika.string1.HasBad;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HasBadTest {
    @Test(dataProvider = "hasBadDP")
    public void testHasBad(String str, boolean except) {
        HasBad hb = new HasBad();
        assertEquals(hb.hasBad(str), except);
    }

    @DataProvider(name = "hasBadDP")
    public Object[][] hasBadDP() {
        return new Object[][]{{"badxx", true},
                {"xbadxx", true},
                {"code", false},
                {"bad", true},
                {"ba", false},
                {"xba", false},
                {"xbad", true},
                {"", false},
                {"badyy", true}};
    }
}