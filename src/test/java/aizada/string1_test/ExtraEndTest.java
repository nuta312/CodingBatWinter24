package aizada.string1_test;

import com.digital_nomads.aizada.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {

    @Test(dataProvider = "TestExtraEnd")
    public void extraEndTest(String str, String expected) {
        ExtraEnd extraEnd = new ExtraEnd();
        Assert.assertEquals(extraEnd.extraEnd(str), expected);

    }

    @DataProvider(name = "TestExtraEnd")
    public Object[][] extraEnd(){
        return new Object [][] {
                {"Hello", "lololo"},
                {"ab","ababab"},
                {"Hi", "HiHiHi"},
                {"Candy", "dydydy"},
                {"Code", "dedede"}
        };
    }
}
