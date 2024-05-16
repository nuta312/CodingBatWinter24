package meka.string1_test;

import com.digital_nomads.meka.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {

    @Test(dataProvider = "testData")
    public void testExtraEnd(String str, String expected){
        ExtraEnd extraEnd = new ExtraEnd();
        String result = extraEnd.extraEnd(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"Hello", "lololo"},
                {"ab", "ababab"},
                {"Hi", "HiHiHi"},
                {"Candy", "dydydy"},
                {"Code", "dedede"}
        };
    }


}
