package aijan.string1_test;

import com.digital_nomads.aijan.string1.Left2;
import com.digital_nomads.aijan.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Left2Test {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"Hello", "lloHe"},
                {"java", "vaja"},
                {"Hi", "Hi"},
                {"code", "deco"},
                {"cat", "tca"},
                {"12345", "34512"},
                {"Chocolate", "ocolateCh"},
                {"bricks", "icksbr"},
        };

    }

    @Test(dataProvider = "word")
    public void testNonStart(String str, String expectedResult) {
        Left2 obj = new Left2();
        String actualResult = obj.left2(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
