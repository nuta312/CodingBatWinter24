package dzhamilya.warmup1_test;

import com.digital_nomads.dzhamilya.warmup1.SleeIn;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SleepInTest {
    @Test (dataProvider = "inTest")
    public void testSleepIn (boolean weekday, boolean vacation, boolean expected){
        SleeIn in = new SleeIn();
        boolean result = in.sleepIn(weekday, vacation);
        Assert.assertEquals(result, expected);




    }
@DataProvider
    public Object[][] inTest() {
        return new Object[][] {
                {false, false , true},
                {true, false, false},
                {false, true, true},
                {true, true, true},


        };
    }
}
