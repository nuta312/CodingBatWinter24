package aizada.warmup1_test;

import com.digital_nomads.aizada.string1.HelloName;
import com.digital_nomads.aizada.warmup1.SleepIn;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SleepInTest {
    @Test(dataProvider = "testSleepIn")
    public void sleepInTest (boolean weekday, boolean vacation, boolean expected){
        SleepIn sleepIn = new SleepIn();

        Assert.assertEquals(sleepIn.sleepIn(weekday, vacation), expected);
    }

    @DataProvider(name = "testSleepIn")
    public Object [][] sleepIn () {
        return new Object[][]{
                {false, false, true},
                {true, false, false},
                {false, true, true},
                {true, true, true}
        };
    }
}
