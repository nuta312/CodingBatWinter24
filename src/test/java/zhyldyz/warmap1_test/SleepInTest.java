package zhyldyz.warmap1_test;

import com.digital_nomads.zhyldyz.warmap1.SleepIn;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SleepInTest {

    SleepIn sleepIn = new SleepIn();

    @Test(dataProvider = "sleepInDataProvider")
    void sleepInTest(Boolean weekday, Boolean vacation, Boolean exception) {

        assertEquals(sleepIn.sleepIn(weekday, vacation), exception);

    }

    @DataProvider(name = "sleepInDataProvider")
    public Boolean[][] sleepInDataProvider() {

        return new Boolean[][]{

                {false, false, true},
                {true, false, false},
                {false, true, true},
                {true, true, true}
        };
    }
}