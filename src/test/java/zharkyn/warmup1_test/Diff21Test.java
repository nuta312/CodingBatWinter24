package zharkyn.warmup1_test;

import com.digital_nomads.zharkyn.warmup1.Diff21;
import com.digital_nomads.zharkyn.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Diff21Test {

    @Test(dataProvider = "diff21DataProvider")
    public void diff21Test(int a, int b){
        Diff21 diff21 = new Diff21();
        int result = diff21.diff21(a);
        Assert.assertEquals(result, b);
    }

    @DataProvider(name = "diff21DataProvider")
    public Object[][] diff21DataProvider(){
        return new Object[][]{
                {19,2},
                {10,11},
                {21,0},
                {22,2},
                {25,8},
                {30,18},
                {0,21},
                {1,20},
                {2,19},
                {-1,22},
                {-2,23},
                {50,58}
        };
    }

}
