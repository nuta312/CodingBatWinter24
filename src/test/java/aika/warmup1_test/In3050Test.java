package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.In3050;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class In3050Test {
    @Test(dataProvider = "in3050DP")
    public void testIn3050(int a, int b, boolean excepted) {
        In3050 i30 = new In3050();
        assertEquals(i30.in3050(a, b), excepted);
    }

    @DataProvider(name = "in3050DP")
    public Object[][] in3050DP() {
        return new Object[][]{{30, 31, true},
                {30, 41, false},
                {40, 50, true},
                {40, 51, false},
                {39, 50, false},
                {50, 39, false},
                {40, 39, true},
                {49, 48, true},
                {50, 40, true},
                {50, 51, false},
                {35, 36, true},
                {35, 45, false}};
    }


}