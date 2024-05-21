package aima.warmup1_test;

import com.digital_nomads.aima.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleTest {
    @Test(dataProvider = "SumDoubleTestDataProvider")
    public void sumDouble(int a, int b, int expected) {
        SumDouble sumDouble = new SumDouble();
        Assert.assertEquals(sumDouble.sumDouble(a, b), expected);
    }

    @DataProvider(name = "SumDoubleTestDataProvider")
    public Object[][] sumDoubleTestDataProvider() {
        return new Object[][]{
                {1, 2, 3},
                {2, 2, 8},
                {3, 2, 5},
                {-1, 0, -1},
                {3, 3, 12},
                {0, 0, 0},
                {0, 1, 1},
                {3, 4, 7}
        };

    }
}