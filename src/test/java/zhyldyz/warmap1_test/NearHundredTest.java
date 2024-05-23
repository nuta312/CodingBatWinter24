package zhyldyz.warmap1_test;

import com.digital_nomads.zhyldyz.warmap1.NearHundred;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NearHundredTest {

    NearHundred nearHundred = new NearHundred();

    @DataProvider(name = "nearHundredTest")
    public Object[][] nearHundredDataProvider(){

        return new Object[][]{

                {93, true},
                {90, true},
                {89, false},
                {110, true},
                {111, false},
                {121, false},
                {-101, false},
                {-209, false},
                {190, true},
                {209, true}
        };
    }

    @Test(dataProvider = "nearHundredTest")
    public void nearHundredTest(int n, boolean expected){

        assertEquals(nearHundred.nearHundred(n), expected);
    }
}