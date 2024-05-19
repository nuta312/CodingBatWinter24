package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.Left2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Left2Test {

    @Test (dataProvider = "left2TestDataProvider")
    public void left2Test(String str, String expected){
        Left2 left2 = new Left2();
        Assert.assertEquals(left2.left2(str), expected);
    }

    @DataProvider (name = "left2TestDataProvider")
    public Object[][] left2TestDataProvider(){
        return new Object[][] {
                {"Hello", "lloHe"},
                {"java", "vaja"},
                {"Hi", "Hi"},
                {"code", "deco"},
                {"cat", "tca"},
                {"12345", "34512"},
                {"Chocolate", "ocolateCh"},
                {"bricks", "icksbr"}
        };
    }
}
