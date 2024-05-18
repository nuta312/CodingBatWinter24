package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {

    @Test (dataProvider = "extraEndDataProvider")
    public void extraEndTest(String str, String expected){
        ExtraEnd extraEnd = new ExtraEnd();
        Assert.assertEquals(extraEnd.extraEnd(str), expected);
    }

    @DataProvider (name = "extraEndDataProvider")
    public Object[][] extraEndDataProvider(){
        return new Object[][]{
                {"Hello", "lololo"},
                {"ab", "ababab"},
                {"Hi", "HiHiHi"},
                {"Candy", "dydydy"},
                {"Code", "dedede"}
        };
    }

}
