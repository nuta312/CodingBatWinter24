package meka.string1_test;

import com.digital_nomads.meka.string1.Left2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Left2Test {

    @Test(dataProvider = "testData")
    public void testLeft2(String str, String expected) {
        Left2 left2 = new Left2();
        String result = left2.left2(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
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
