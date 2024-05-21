package nargiza.warmup1_test;

import com.digital_nomads.nargiza.warmup1.PosNeg;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PosNegTest {

    PosNeg posNeg = new PosNeg();

    @DataProvider(name = "word")
    public Object[][] getPosNeg(){
        return new Object[][]{
                {1, -1, false, true},
                {-1, 1, false, true},
                {-4, -5, true, true}
        };
    }

    @Test(dataProvider = "word")
    public void testPosNeg(int a, int b, boolean negative, boolean expected){
        Assert.assertEquals(posNeg.posNeg(a, b, negative), expected);
    }
}