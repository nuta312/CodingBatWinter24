package zharkyn.warmup1_test;

import com.digital_nomads.zharkyn.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleTest {

    @Test (dataProvider = "sumDoubleDataProvider")
    public void sumDoubleTest(int a, int b, int c){
        SumDouble sumDouble = new SumDouble();
        int result = sumDouble.sumDouble(a,b);
        Assert.assertEquals(result, c);
    }

    @DataProvider (name = "sumDoubleDataProvider")
    public Object[][] sumDoubleDataProvider(){
        return new Object[][]{
                {1,2,3},
                {3,2,5},
                {2,2,8},
                {-1,0,-1},
                {3,3,12},
                {0,0,0},
                {0,1,1},
                {3,4,7}
        };
    }
}
