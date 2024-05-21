package aijan.warmup1_test;

import com.digital_nomads.aijan.warmup1.SleepIn;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SleepInTest {

    @DataProvider(name = "data")
    public Object[][] provideData () {
        return new Object[][] {
                {false, false, true},
                {true, false, false},
                {false, true, true},
                {true, true, true},
        };
    }

    @Test(dataProvider = "data")
    public void TestSleepIn (boolean weekday, boolean vacation, boolean expected) {
        SleepIn obj = new SleepIn();
        boolean actual = obj.sleepIn(weekday, vacation);
        Assert.assertEquals(actual,expected);
    }
}
