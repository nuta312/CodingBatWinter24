package nargiza.warmup1_test;

import com.digital_nomads.nargiza.warmup1.NearHundred;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NearHundredTest {

    NearHundred nearHundred = new NearHundred();

    @DataProvider(name = "word")
    public Object[][] getNearHundred(){
        return new Object[][]{
                {93, true},
                {90, true},
                {89, false}
        };
    }

    @Test(dataProvider = "word")
    public void testNearHundred(int n, boolean expected){
        assertEquals(nearHundred.nearHundred(n), expected);
    }
}
