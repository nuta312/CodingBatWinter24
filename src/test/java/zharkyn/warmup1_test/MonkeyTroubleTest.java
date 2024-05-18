package zharkyn.warmup1_test;

import com.digital_nomads.zharkyn.warmup1.MonkeyTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MonkeyTroubleTest {

    @Test (dataProvider = "monkeyTroubleDataProvider")
    public void monkeyTroubleTest(boolean aSmile, boolean bSmile, boolean expected){
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        boolean actual = monkeyTrouble.monkeyTrouble(aSmile, bSmile);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider (name = "monkeyTroubleDataProvider")
    public Object[][] monkeyTroubleDataProvider(){
        return  new Object[][] {
                {true, true, true},
                {false, false, true},
                {true, false, false},
                {false, true, false}
        };
    }
}
