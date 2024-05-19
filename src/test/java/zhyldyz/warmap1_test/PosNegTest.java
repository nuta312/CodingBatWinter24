package zhyldyz.warmap1_test;

import com.digital_nomads.zhyldyz.warmap1.PosNeg;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PosNegTest {

    PosNeg posNeg = new PosNeg();

    @DataProvider(name = "posNegTest")
    public Object[][] posNegDataProvider(){

        return new Object[][]{
                {-1, 1, false, true},
                {1, -1, false, true},
                {-4, -5, true, true},
                {-4, -5, false, false},
                {-4, 5, false, true},
                {-4, 5, true, false},
                {1, 1, false, false},
                {-1, -1, false, false},
                {1, -1, true, false},
                {-1, 1, true, false},
                {1, 1, true, false}
        };
    }

    @Test(dataProvider = "posNegTest")
    void posNegTest(int a, int b, boolean negative, boolean expected){

        assertEquals(posNeg.posNeg(a, b, negative), expected);
    }
}