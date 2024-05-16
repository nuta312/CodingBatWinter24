package almaz.warmup1_test;

import com.digital_nomads.almaz.warmup1.SleepIn;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SleepInTest {


    @DataProvider
    public Object[][] TestSleepIn(){
        SleepIn sleepIn = new SleepIn();
        return new Object[][]{
                {false, false},
                {true, false},
                {false, true},
                {true, true}
        };
    }

    @Test(dataProvider = "TestSleepIn")
    public void testCanSleepIn(boolean weekday, boolean vacation) {


    }
}
