package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.StartHi;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StartHiTest {
    @Test(dataProvider = "startHi")
    public void testStartHi(String str, boolean expected) {
        StartHi sh = new StartHi();
        assertEquals(sh.startHi(str), expected);

    }

    @DataProvider (name = "startHi")
    public Object[][] startHi() {
        return new Object[][]{{"hi there", true},
                {"hi", true},
                {"hello hi", false},
                {"he", false},
                {"h", false},
                {"", false},
                {"ho hi", false},
                {"hi ho", true}};
    }

}