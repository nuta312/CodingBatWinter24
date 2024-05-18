package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {

    @Test(dataProvider = "extraEndProvider")
    public void testExtraEnd(String str, String expected){
        Assert.assertEquals(ExtraEnd.extraEnd(str) ,expected);
    }

    @DataProvider
    public Object[] [] extraEndProvider(){
        return new Object[][]{
                { "Hello", "lololo"},
                {"ab" ,"ababab"},
                {"Hi", "HiHiHi"},
                {"Candy", "dydydy"}
        };
    }
}
