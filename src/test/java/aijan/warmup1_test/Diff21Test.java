package aijan.warmup1_test;

import com.digital_nomads.aijan.warmup1.Diff21;
import com.digital_nomads.aijan.warmup1.MonkeyTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Diff21Test {
    @DataProvider(name = "data")
    public Object[][] provideData() {
        return new Object[][] {
                {19, 2},
                {10, 11},
                {21, 0},
                {22, 2},
                {25, 8},
                {30, 18},
                {0, 21},
                {1, 20},
                {2, 19},
                {-1, 22},
                {-2, 23},
                {50, 58},
        };
    }

    @Test(dataProvider = "data")
    public void testDiff21(int n, int expected) {
        Diff21 obj = new Diff21();
        int actual = obj.diff21(n);
        Assert.assertEquals(actual,expected);
    }
}