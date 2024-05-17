package mika.warmup1_test;

import com.digital_nomads.mika.warmup1.SleepIn;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SleepInTest {

    @DataProvider
    public Object [] [] sleepInTest() {
        return new Object[] [] {
                {false, false, true},
                {true, false, false},
                {false, true, true},
                {true, true, true},

        };
    }



    @Test (dataProvider = "sleepInTest")
    public void testSleepIn(boolean an1, boolean an2, boolean expected) {
    SleepIn sleepIn = new SleepIn();
        Boolean result = sleepIn.sleepIn(an1,an2);

        Assert.assertEquals(result, expected);
    }


}
