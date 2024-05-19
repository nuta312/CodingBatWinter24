package aima.warmup1_test;

import com.digital_nomads.aima.warmup1.SleepIn;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SleepInTest {
    @Test(dataProvider = "boolean")
    public void sleepIn(boolean weekday, boolean vacation, boolean expected) {
        SleepIn sleepIn = new SleepIn();
        Assert.assertEquals(sleepIn.sleepIn(weekday, vacation), expected);
    }

    @DataProvider(name = "boolean")
    public Object[][] provideValues() {
        return new Object[][]{
                {"false", "false", "true"},
                {"true", "false", "false"},
                {"false", "true", "true"},
                {"true", "true", "true"},
        };

    }
}