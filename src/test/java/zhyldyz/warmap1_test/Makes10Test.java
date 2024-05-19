package zhyldyz.warmap1_test;

import com.digital_nomads.zhyldyz.warmap1.Makes10;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Makes10Test {

    Makes10 makes10 = new Makes10();

    @DataProvider(name = "makes10Test")
    public Object[][] makes10Test(){

        return new Object[][]{

                {9, 10, true},
                {9, 9, false},
                {1, 9, true},
                {10, 1, true},
                {10, 10, true},
                {8, 2, true},
                {8, 3, false}
        };
    }

    @Test(dataProvider = "makes10Test")
    void makes10(int a, int b, boolean expected){

        assertEquals(makes10.makes10(a, b), expected);
    }

}