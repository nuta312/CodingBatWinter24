package dzhamilya.string1_test;

import com.digital_nomads.dzhamilya.string1.Left2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Left2Test {
    @Test(dataProvider = "left2Test1")
    public void testLeft2(String str, String expected){
        Left2 left = new Left2();
        String result = left.left2(str);
        Assert.assertEquals(result, expected);
    }
    @DataProvider
    public Object [][] left2Test1() {
        return new Object[][] {
                {"Hello", "lloHe"},
                {"java", "vaja"},
                {"Hi", "Hi"},
                {"code","deco"},
                {"cat", "tca"},
                {"12345", "34512"},
                {"Chocolate", "ocolateCh"},
                {"bricks", "icksbr"},
        };

    }
}
