package nargiza.warmup1_test;

import com.digital_nomads.nargiza.warmup1.ParrotTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParrotTroubleTest {

ParrotTrouble parrotTrouble = new ParrotTrouble();

@DataProvider(name = "word")
    public Object[][] getParrotTrouble(){
    return new Object[][]{
            {true, 6, true},
            {true, 7, false},
            {false, 6, false}
    };
}

@Test(dataProvider = "word")
    public void testParrotTrouble(boolean talking, int hour, boolean expected){
    Assert.assertEquals(parrotTrouble.parrotTrouble(talking, hour),expected);
}

}