package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.SumDouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SumDoubleTest {
    @Test(dataProvider = "sumDoubleDP")
    public void testSumDouble(int a, int b, int expected) {
        SumDouble sd = new SumDouble();
        assertEquals(sd.sumDouble(a, b), expected);
    }

    @DataProvider(name = "sumDoubleDP")
    public Object[][] sumDoubleDP() {
        return new Object[][]{{1, 2, 3},
                {3, 2, 5},
                {2, 2, 8},
                {-1, 0, -1},
                {3, 3, 12},
                {0, 0, 0},
                {0, 1, 1},
                {3, 4, 7}};


    }

}