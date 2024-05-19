package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.Max1020;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Max1020Test {
    @Test(dataProvider = "max1020")
    public void testMax1020(int a, int b, int excepted) {
        Max1020 m1 = new Max1020();
        assertEquals(m1.max1020(a, b), excepted);
    }

    @DataProvider(name = "max1020")
    public Object[][] max1020() {
        return new Object[][]{{11, 19, 19},
                {19, 11, 19},
                {11, 9, 11},
                {9, 21, 0},
                {10, 21, 10},
                {21, 10, 10},
                {9, 11, 11},
                {23, 10, 10},
                {20, 10, 20},
                {7, 20, 20},
                {17, 16, 17}};
    }
}