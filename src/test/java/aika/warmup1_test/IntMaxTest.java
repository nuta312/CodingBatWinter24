package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.IntMax;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntMaxTest {
    @Test(dataProvider = "intMaxDP")
    public void testIntMax(int a, int b, int c, int excepted) {
        IntMax im = new IntMax();
        assertEquals(im.intMax(a, b, c), excepted);

    }

    @DataProvider(name = "intMaxDP")
    public Object[][] intMaxDP() {
        return new Object[][]{{1, 2, 3, 3},
                {1, 3, 2, 3},
                {3, 2, 1, 3},
                {9, 3, 3, 9},
                {3, 9, 3, 9},
                {3, 3, 9, 9},
                {8, 2, 3, 8},
                {-3, -1, -2, -1},
                {6, 2, 5, 6},
                {5, 6, 2, 6},
                {5, 2, 6, 6}};
    }

}