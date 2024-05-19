package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.LeftTwo;
import com.digital_nomads.zafura.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LeftTwoTest {
    @Test(dataProvider = "left")
    public void testLeftTwo(String str, String expected) {
        LeftTwo leftTwo= new LeftTwo();
        Assert.assertEquals(leftTwo.left2(str),expected);
    }
    @DataProvider
    public Object[][]left(){
        return new Object[][]{
                {"Hello","lloHe"},
                {"java", "vaja"},
                {"Hi", "Hi"},
                {"code","deco"},
                {"cat", "tca"},

        };
    }
}
