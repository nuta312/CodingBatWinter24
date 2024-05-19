package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.PosNeg;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PosNegTest {
    @Test(dataProvider = "posNegDP")
    public void testposNeg(int a, int b, boolean negative, boolean excepted) {
        PosNeg pn = new PosNeg();
        assertEquals(pn.posNeg(a, b, negative), excepted);
    }

    @DataProvider(name = "posNegDP")
    public Object[][] posNegDP() {
        return new Object[][]{{1, -1, false, true},
                {-1, 1, false, true},
                {-4, -5, true, true},
                {-4, -5, false, false},
                {-4, 5, false, true},
                {-4, 5, true, false},
                {1, 1, false, false},
                {-1, -1, false, false}};

    }

}