package aijan.warmup1_test;

import com.digital_nomads.aijan.warmup1.MonkeyTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MonkeyTroubleTest {
    @DataProvider(name = "data")
    public Object[][] provideData() {
        return new Object[][] {
                {true, true, true},
                {false, false, true},
                {true, false, false},
                {false, true, false},
        };
    }

    @Test(dataProvider = "data")
    public void testMonreyTrouble(boolean aSmile, boolean bSmile, boolean expected) {
        MonkeyTrouble obj = new MonkeyTrouble();
        boolean actual = obj.monkeyTrouble(aSmile, bSmile);
        Assert.assertEquals(actual,expected);
    }

}
