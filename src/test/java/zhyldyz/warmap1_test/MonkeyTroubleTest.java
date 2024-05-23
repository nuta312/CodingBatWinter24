package zhyldyz.warmap1_test;

import com.digital_nomads.zhyldyz.warmap1.MonkeyTrouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MonkeyTroubleTest {

    MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

    @DataProvider(name = "monkeyTroubleDataProvider")
    public Boolean[][] monkeyTroubleDataProvider() {

        return new Boolean[][]{

                {true, true, true},
                {false, false, true},
                {true, false, false},
                {false, true, false}
        };
    }

    @Test(dataProvider = "monkeyTroubleDataProvider")
    void monkeyTroubleTest(boolean aSmile, boolean bSmile, boolean exception) {

        assertEquals(monkeyTrouble.monkeyTrouble(aSmile, bSmile), exception);
    }
}