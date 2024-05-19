package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.HasTeen;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HasTeenTest {
    @Test(dataProvider = "hasTeenDP")
    public void testHasTeen(int a, int b, int c, boolean excepted) {
        HasTeen ht = new HasTeen();
        assertEquals(ht.hasTeen(a, b, c), excepted);
    }

    @DataProvider(name = "hasTeenDP")
    public Object[][] hasTeenDP() {
        return new Object[][]{{13, 20, 10, true},
                {20, 19, 10, true},
                {20, 10, 13, true},
                {1, 20, 12, false},
                {19, 20, 12, true},
                {12, 20, 19, true},
                {12, 9, 20, false},
                {12, 18, 20, true},
                {14, 2, 20, true},
                {4, 2, 20, false},
                {11, 22, 22, false}};
    }

}