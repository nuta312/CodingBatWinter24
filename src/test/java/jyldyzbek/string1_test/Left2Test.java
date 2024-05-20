package jyldyzbek.string1_test;

import com.digital_nomads.jyldyzbek.string1.Left2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Left2Test {

    @Test(dataProvider = "left2")
    public void left2(String str, String str1) {
        Left2 left2 = new Left2();
        String result = left2.left2(str);
        assert result.equals(str1);
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