package nargiza.warmup1_test;

import com.digital_nomads.nargiza.warmup1.SleepIn;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SleepInTest {

    SleepIn sleepIn = new SleepIn();

    @DataProvider(name = "word")
    public Object[][] getSleepIn(){
        return new Object[][]{
                {false, false, true},
                {true, false, false},
                {false, true, true}
        };
    }

    @Test(dataProvider = "word")
    public void testSleepIn(boolean weekday, boolean vacation, boolean expected){
        Assert.assertEquals(sleepIn.sleepIn(weekday, vacation), expected);
    }
}
