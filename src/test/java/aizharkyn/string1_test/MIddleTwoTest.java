package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.MiddleTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MIddleTwoTest {

    @Test(dataProvider = "middleTwoProvider")
    public  void testMiddleTwo(String str, String expected){
        Assert.assertEquals(MiddleTwo.middleTwo(str), expected);
    }

    @DataProvider
    public Object[][] middleTwoProvider(){
        return new Object[][]{
                {"string","ri"},
                {"code", "od"},
                {"Practice", "ct"}
        };
    }
}
