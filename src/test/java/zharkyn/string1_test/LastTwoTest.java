package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.LastTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastTwoTest {

    @Test(dataProvider = "lastTwoDataProvider")
    public void lastTwoTest(String str, String expected){
        LastTwo lastTwo = new LastTwo();
        Assert.assertEquals(lastTwo.lastTwo(str), expected);
    }

    @DataProvider(name = "lastTwoDataProvider")
    public Object[][] lastTwoTestDataProvider(){
        return new Object[][] {
                {"coding", "codign"},
                {"cat", "cta"},
                {"ab", "ba"},
                {"a", "a"},
                {"", ""}
        };
    }
}
