package zhyldyz.warmap1_test;

import com.digital_nomads.zhyldyz.warmap1.ParrotTrouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParrotTroubleTest {

    ParrotTrouble parrotTrouble = new ParrotTrouble();

    @DataProvider(name = "ParrotTroubleTest")
    public Object[][] ParrotTroubleDataProvider() {

        return new Object[][]{

                {true, 6, true},
                {true, 7, false},
                {false, 6, false},
                {true, 21, true},
                {false, 21, false},
                {false, 20, false},
                {true, 23, true}
        };
    }

    @Test(dataProvider = "ParrotTroubleTest")
    void parrotTroubleTest(boolean talking, int hour, boolean expected){

        assertEquals(parrotTrouble.parrotTrouble(talking, hour), expected);
    }


}