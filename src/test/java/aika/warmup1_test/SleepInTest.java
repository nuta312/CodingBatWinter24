package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.SleepIn;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SleepInTest {
    @Test(dataProvider = "sleepInDataProvider")
    public void testSleepIn(boolean weekday, boolean vacation, boolean expected){
        SleepIn sp = new SleepIn();
        assertEquals(sp.sleepIn(weekday,vacation),expected);
    }
    @DataProvider(name = "sleepInDataProvider")
    public Object[][] sleepInDataProvider(){
        return new Object[][]{{false,false,true},
                              {true,false,false},
                              {false,true,true},
                              {true,true,true}};
    }
}