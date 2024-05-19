package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.MiddleTwo;
import com.digital_nomads.zharkyn.string1.WithouEnd2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleTwoTest {

    @Test(dataProvider = "middleTwoDataProvider")
    public void middleTwoTest(String str, String expected){
        MiddleTwo middleTwo = new MiddleTwo();
        Assert.assertEquals(middleTwo.middleTwo(str), expected);
    }

    @DataProvider(name = "middleTwoDataProvider")
    public Object[][] middleTwoDataProvider(){
        return new Object[][] {
                {"string","ri"},
                {"code","od"},
                {"Practice","ct"},
                {"ab","ab"},
                {"0123456789","45"}
        };
    }
}
