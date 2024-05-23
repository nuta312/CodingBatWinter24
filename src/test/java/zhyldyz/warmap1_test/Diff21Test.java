package zhyldyz.warmap1_test;

import com.digital_nomads.zhyldyz.warmap1.Diff21;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Diff21Test {

    Diff21 diff21 = new Diff21();

    @DataProvider(name = "diff21DataProvider")
    public Integer[][] diff21DataProvider() {

        return new Integer[][]{

                {30, 18},
                {25, 8},
                {1, 20},
                {0, 21},
                {2, 19},
                {-1, 22},
                {-2, 23},
                {21, 0},
                {22, 2}

        };
    }

    @Test(dataProvider = "diff21DataProvider")
    void diff21Test(int n, int exception) {

        assertEquals(diff21.diff21(n), exception);
    }

}