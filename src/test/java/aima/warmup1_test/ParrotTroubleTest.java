package aima.warmup1_test;

import com.digital_nomads.aima.warmup1.ParrotTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParrotTroubleTest {
    ParrotTrouble parrotTrouble = new ParrotTrouble();

    @DataProvider(name = "DataProvider")
    public Object[][] parrotTroubleTest() {
            return new Object[][]  {
                    {true, 6, true},
                    {true, 7, false},
                    {false, 6, false},
                    {true, 21, true},
                    {false, 21, false},
                    {false, 20, false},
                    {true, 23, true},
                    {false, 23, false},
                    {true, 20, false},
                    {false, 12, false},
            };
    }
    @Test (dataProvider = "DataProvider")
    void parrotTrouble(boolean talking, int hour, boolean expected) {
        Assert.assertEquals(parrotTrouble.parrotTrouble(talking, hour), expected);
    }
}
