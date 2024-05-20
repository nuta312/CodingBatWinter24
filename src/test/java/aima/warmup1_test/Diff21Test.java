package aima.warmup1_test;

import com.digital_nomads.aima.warmup1.Diff21;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Diff21Test {
    Diff21 diff21 = new Diff21();

    @DataProvider(name = "DataProvider")
    public Object[][] diff21Test() {
        return new Object[][]{
                {19, 2},
                {10, 11},
                {21, 0},
                {22, 2},
                {25, 8},
                {30, 18},
                {0, 21},
                {1, 20},
                {1, 20},
                {2, 19},
                {-1, 22},
                {-2, 23},
                {50, 58},
        };
    }

    @Test(dataProvider = "DataProvider")
    void diff21(int n, int expected) {
        Assert.assertEquals(diff21.diff21(n), expected);
    }
}