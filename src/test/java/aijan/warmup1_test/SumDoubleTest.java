package aijan.warmup1_test;

import com.digital_nomads.aijan.warmup1.MonkeyTrouble;
import com.digital_nomads.aijan.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SumDoubleTest {
    @DataProvider(name = "data")
    public Object[][] provideData() {
        return new Object[][] {
                {1, 2, 3},
                {3, 2, 5},
                {2, 2, 8},
                {-1, 0, -1},
                {3, 3, 12},
                {0, 0, 0},
                {0, 1, 1},
                {3, 4, 7}
        };
    }

    @Test(dataProvider = "data")
    public void testSumDouble(int a, int b, int expected) {
        SumDouble obj = new SumDouble();
        int actual = obj.sumDouble(a, b);
        Assert.assertEquals(actual,expected);
    }


}