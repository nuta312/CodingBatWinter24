package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.Left2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Left2Test {
    Left2 left2 = new Left2();

    @Test(dataProvider = "left2")
    public void testLeft2(String str, String expected) {

        Assert.assertEquals(left2.left2(str), expected);
    }

    @DataProvider(name = "left2")
    public Object[][] left2() {
        return new Object[][]{
                {"Hello", "lloHe"},
                {"java", "vaja"},
                {"Hi", "Hi"},
                {"code", "deco"},
                {"12345", "34512"},
                {"Chocolate", "ocolateCh"},
                {"bricks", "icksbr"},
        };
    }
}
