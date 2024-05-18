package nuraiym.string1_test;

import com.digital_nomads.nuraiym.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {

    @Test(dataProvider = "ExtraEndData")
    public void testExtraEnd(String str, String expected) {
        ExtraEnd extraEnd = new ExtraEnd();
        String result = extraEnd.extraEnd(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "ExtraEndData")
    public Object[][] extraEndDataProvider() {
        return new Object[][]{
                {"Hello", "lololo"},
                {"ab", "ababab"},
                {"Hi", "HiHiHi"},
                {"Candy", "dydydy"},
                {"Code", "dedede"}
        };
    }
}
