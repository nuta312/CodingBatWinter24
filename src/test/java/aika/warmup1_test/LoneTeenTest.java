package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.LoneTeen;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoneTeenTest {
    @Test(dataProvider = "loneTeenDP")
    public void testLoneTeen(int a, int b, boolean excepted) {
        LoneTeen lt = new LoneTeen();
        assertEquals(lt.loneTeen(a, b), excepted);
    }

    @DataProvider( name = "loneTeenDP")
    public Object[][] loneTeenDP() {
        return new Object[][]{{13, 99, true},
                {21, 19, true},
                {13, 13, false},
                {14, 20, true},
                {20, 15, true},
                {16, 17, false},
                {16, 9, true},
                {16, 18, false},
                {13, 19, false},
                {13, 20, true},
                {6, 18, true},
                {99, 13, true},
                {99, 99, false}};
    }

}