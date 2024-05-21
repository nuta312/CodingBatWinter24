package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.EndsLy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndsLyTest {

    @Test(dataProvider = "endsLyProvider")
    public void testEndsLy(String str, boolean expected){
        Assert.assertEquals(EndsLy.endsLy(str), expected);
    }

    @DataProvider
    public Object[][] endsLyProvider(){
        return new Object[][]{
                {"oddly", true},
                {"y", false},
                {"oddy", false},
                {"olydd", false}
        };
    }
}
