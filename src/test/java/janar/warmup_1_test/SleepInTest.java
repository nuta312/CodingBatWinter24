package janar.warmup_1_test;

import com.digital_nomads.janar.warmup_1.SleepIn;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SleepInTest {
    @Test
    public void testSleepIn(){
        SleepIn sleepIn = new SleepIn();
        assertEquals(sleepIn.sleepIn(false,false), true);
    }

    @DataProvider(name = "sleepInProvider")
    public Object[][] sleepInProvider(){
        return new Object[][]{
                {false,false,true},
                {true,false,false},
                {false,true,true},
                {true,true,true},
        };
    }

    @Test(dataProvider = "sleepInProvider")
    public void testSleepIn(boolean weekday, boolean vacation, boolean expected){
        boolean result = sleepIn(weekday, vacation);
        assertEquals(result, expected);
    }

    private boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
