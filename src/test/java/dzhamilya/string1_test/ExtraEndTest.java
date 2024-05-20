package dzhamilya.string1_test;

import com.digital_nomads.dzhamilya.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {

    @Test(dataProvider = "ExtraTest")
    public void endTest(String str, String expected) {
        ExtraEnd end = new ExtraEnd();
        Assert.assertEquals(end.extraEnd(str),expected);


    }
    @DataProvider
    public Object[][] ExtraTest() {
        return new Object[][] {
                {"Hello", "lololo"},
                {"ab", "ababab"},
                {"Hi", "HiHiHi"},
                {"Candy", "dydydy"},
                {"Code", "dedede"}


        };
    }
}
