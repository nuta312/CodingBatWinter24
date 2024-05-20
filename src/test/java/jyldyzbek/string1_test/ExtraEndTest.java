package jyldyzbek.string1_test;

import com.digital_nomads.jyldyzbek.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {

    @Test(dataProvider = "extraEnd")
    public void extraEnd(String str, String str1){
        ExtraEnd extraEnd = new ExtraEnd();
        String result = extraEnd.extraEnd(str);
        Assert.assertEquals(result, str1);
    }

    @DataProvider
    public Object[][] extraEnd(){
        return new Object[][]{
                {"Hello", "lololo"},
                {"ab", "ababab"},
                {"Hi", "HiHiHi"},
                {"Candy", "dydydy"},
                {"Code", "dedede"}
        };
    }
}
