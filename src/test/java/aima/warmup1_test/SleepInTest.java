package aima.warmup1_test;

import com.digital_nomads.aima.warmup1.SleepIn;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SleepInTest {
    SleepIn sleepIn = new SleepIn();

    @DataProvider(name = "DataProvider")
    public Object[][] sleepInDataProvider() {

        return new Object[][]{

                {false, false, true},
                {true, false, false},
                {false, true, true},
                {true, true, true}
        };
    }

    @Test(dataProvider = "DataProvider")
    void sleepInTest(boolean aSmile, boolean bSmile, boolean exception) {

        assertEquals(sleepIn.sleepIn(aSmile, bSmile), exception);
    }
}
