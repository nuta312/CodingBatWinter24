package aima.warmup1_test;

import com.digital_nomads.aima.warmup1.MonkeyTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MonkeyTroubleTest {
@Test (dataProvider = "words")
    public void monkeyTrouble(boolean aSmile, boolean bSmile, boolean expected) {
    MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
    Assert.assertEquals(monkeyTrouble.monkeyTrouble(aSmile, bSmile), expected);
    }
    @DataProvider (name = "words")
    public Object[][] providerWords(){
    return new Object[][]{
            {"true", "true", "true"},
            {"false", "false", "true"},
            {"true", "false", "false"},
            {"false", "true", "false"},
    };
    }
}
