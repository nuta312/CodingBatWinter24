package zharkyn.warmup1_test;

import com.digital_nomads.zharkyn.warmup1.Makes10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Makes10Test {

    @Test(dataProvider = "makes10DataProvider")
    public void makes10Test(int a, int b, boolean expected){
        Makes10 makes10 = new Makes10();
        Assert.assertEquals(makes10.makes10(a, b), expected);
    }

    @DataProvider(name = "makes10DataProvider")
    public Object[][] makes10DataProvider(){
        return new Object [][]{
                {9, 10, true},
                {9, 9, false},
                {1, 9, true},
                {10, 1, true},
                {10, 10, true},
                {8, 2, true},
                {8, 3, false},
                {10, 42, true},
                {12, -2, true}
        };
    }
}
