package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.Right2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Right2Test {

    @Test (dataProvider = "right2DataProvider")
    public void right2Test(String str, String expected) {
        Right2 right2 = new Right2();
        Assert.assertEquals(right2.right2(str), expected);
    }

    @DataProvider(name = "right2DataProvider")
    public Object[][] right2DataProvider() {
        return new Object[][]{
                {"Hello", "loHel"},
                {"java", "vaja"},
                {"Hi", "Hi"},
                {"code", "deco"},
                {"cat", "atc"},
                {"12345", "45123"},
        };
    }
}
