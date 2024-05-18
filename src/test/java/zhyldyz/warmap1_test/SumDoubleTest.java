package zhyldyz.warmap1_test;

import com.digital_nomads.zhyldyz.warmap1.SumDouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SumDoubleTest {

    SumDouble sumDouble = new SumDouble();

    @DataProvider(name = "sumDoubleDataProvider")
    public Integer[][] sumDoubleDataProvider(){

        return new Integer[][]{

                {1, 2, 3},
                {3, 2, 5},
                {2, 2, 8},
                {-1, 0, -1},
                {3, 3, 12},
                {0, 0, 0},
                {0, 1, 1},
                {3, 4, 7},
        };
    }

    @Test(dataProvider = "sumDoubleDataProvider")
    void sumDouble(int a, int b, int exception){

        assertEquals(sumDouble.sumDouble(a, b), exception);
    }
}