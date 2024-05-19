package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.MonkeyTrouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MonkeyTroubleTest {
    @Test(dataProvider = "monkeyTroubleDataProvider")
    public void testMonkeyTrouble(boolean aSmile, boolean bSmile, boolean expected) {
        MonkeyTrouble mt = new MonkeyTrouble();
        assertEquals(mt.monkeyTrouble(aSmile, bSmile), expected);
    }

    @DataProvider(name = "monkeyTroubleDataProvider")
    public Object[][] monkeyTroubleDataProvider() {
        return new Object[][]{{true, true, true},
                {false, false, true},
                {true, false, false},
                {false, true, false}};
    }
}