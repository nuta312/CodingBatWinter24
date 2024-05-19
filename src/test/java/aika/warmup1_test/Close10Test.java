package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.Close10;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Close10Test {
    @Test(dataProvider = "close10DP")
    public void testClose10(int a, int b, int excepted) {
        Close10 c1 = new Close10();
        assertEquals(c1.close10(a, b), excepted);
    }

    @DataProvider(name = "close10DP")
    public Object[][] close10DP() {
        return new Object[][]{{8, 13, 8},
                {13, 8, 8},
                {13, 7, 0},
                {7, 13, 0},
                {9, 13, 9},
                {13, 8, 8},
                {10, 12, 10},
                {11, 10, 10},
                {5, 21, 5},
                {0, 20, 0},
                {10, 10, 0}};
    }
}