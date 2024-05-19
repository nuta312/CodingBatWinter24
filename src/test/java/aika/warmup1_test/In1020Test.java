package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.In1020;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class In1020Test {
    @Test(dataProvider = "in1020DP")
    public void testIn1020(int a, int b, boolean excepted) {
        In1020 i1 = new In1020();
        assertEquals(i1.in1020(a, b), excepted);
    }

    @DataProvider(name = "in1020DP")
    public Object[][] in1020DP() {
        return new Object[][]{{12, 19, true},
                {21, 12, true},
                {8, 99, false},
                {99, 10, true},
                {20, 20, true},
                {21, 21, false},
                {9, 9, false}};
    }
}