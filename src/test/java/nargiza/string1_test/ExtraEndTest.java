package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {

ExtraEnd extraEnd = new ExtraEnd();

    @DataProvider(name = "inputOutputData")
    public Object[][] getInputOutputData(){
        return new Object[][]{
                {"Hello", "lololo"},
                {"ab", "ababab"},
                {"Hi", "HiHiHi"}
        };
    }

    @Test(dataProvider = "inputOutputData")
    public void testExtraEndTest(String str, String expected){
        String str1 = extraEnd.extraEnd(str);
        Assert.assertEquals(str1, expected);

    }
}
