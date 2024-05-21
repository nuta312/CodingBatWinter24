package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.Diff21;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Diff21Test {
    @Test(dataProvider = "diff21DP")
    public void testDiff21(int n, int excepted) {
        Diff21 d = new Diff21();
        assertEquals(d.diff21(n), excepted);
    }

    @DataProvider(name = "diff21DP")
    public Object[][] diff21DP() {
        return new Object[][]{{19, 2},
                {10, 11},
                {21, 0},
                {22, 2},
                {25, 8},
                {30, 18},
                {0, 21},
                {1, 20},
                {2, 19}};
    }

}