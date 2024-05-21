package nargiza.warmup1_test;

import com.digital_nomads.nargiza.warmup1.MonkeyTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MonkeyTroubleTest {

MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

@DataProvider(name = "word")
public Object[][] getMonkeyTrouble(){
    return new Object[][]{
            {true, true, true},
            {false, false, true},
            {true, false, false}
    };
}

@Test(dataProvider = "word")
public void testMonkeyTrouble(boolean aSmile, boolean bSmile, boolean expected){
    Assert.assertEquals(monkeyTrouble.monkeyTrouble(aSmile, bSmile), expected);
}
}