package aima.warmup1_test;

import com.digital_nomads.aima.warmup1.MonkeyTrouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class MonkeyTroubleTest {
    MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

    @DataProvider(name = "DataProvider")
    public Object[][] monkeyTroubleDataProvider() {

        return new Object[][]{

                {true, true, true},
                {false, false, true},
                {true, false, false},
                {false, true, false}
        };
    }

    @Test(dataProvider = "DataProvider")
    void monkeyTroubleTest(boolean aSmile, boolean bSmile, boolean exception) {

        assertEquals(monkeyTrouble.monkeyTrouble(aSmile, bSmile), exception);
    }
}