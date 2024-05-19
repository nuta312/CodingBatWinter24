package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.ParrotTrouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParrotTroubleTest {
    @Test(dataProvider = "parrotTroubleDP")
    public void testParrotTrouble(boolean talking, int hour, boolean expected) {
        ParrotTrouble pt = new ParrotTrouble();
        assertEquals(pt.parrotTrouble(talking, hour), expected);
    }

    @DataProvider(name = "parrotTroubleDP")
    public Object[][] parrotTroubleDP() {
        return new Object[][]{{true, 6, true},
                {true, 7, false},
                {false, 6, false},
                {true, 21, true},
                {false, 21, false},
                {false, 20, false},
                {true, 23, true},
                {false, 23, false},
                {true, 20, false},
                {false, 12, false}};

    }

}