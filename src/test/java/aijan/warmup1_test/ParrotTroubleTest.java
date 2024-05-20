package aijan.warmup1_test;

import com.digital_nomads.aijan.warmup1.MonkeyTrouble;
import com.digital_nomads.aijan.warmup1.ParrotTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParrotTroubleTest {
    @DataProvider(name = "data")
    public Object[][] provideData() {
        return new Object[][]{
                {true, 6, true},
                {true, 7, false},
                {false, 6, false},
                {true, 21, true},
                {false, 21, false},
                {false, 20, false},
                {true, 23, true},
                {false, 23, false},
                {true, 20, false},
                {false, 12, false},
        };
    }

    @Test(dataProvider = "data")
    public void testParrotTrouble(boolean talking, int hour, boolean expected) {
        ParrotTrouble obj = new ParrotTrouble();
        boolean actual = obj.parrotTrouble(talking, hour);
        Assert.assertEquals(actual, expected);
    }


}