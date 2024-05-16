package zharkyn.warmup1_test;

import com.digital_nomads.zharkyn.warmup1.SleepIn;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SleepInTest {

    @Test (dataProvider = "sleepInDataProvider")
    public void sleepInTest(boolean weekday, boolean vacation, boolean expected){
        SleepIn sleepIn = new SleepIn();
        Assert.assertEquals(sleepIn.sleepIn(weekday, vacation), expected);
    }

    @DataProvider (name = "sleepInDataProvider")
    public Object[][] sleepInDataProvider(){
        return new Object [][]{
            {false, false, true},
            {true, false, false},
            {false, true, true},
            {true, true, true}
        };
    }

}
