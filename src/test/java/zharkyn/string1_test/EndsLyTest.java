package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.EndsLy;
import com.digital_nomads.zharkyn.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndsLyTest {

    @Test(dataProvider = "endsLyDataProvider")
    public void endsLyTest(String str, boolean expected){
        EndsLy endsLy = new EndsLy();
        Assert.assertEquals(endsLy.endsLy(str), expected);
    }

    @DataProvider(name = "endsLyDataProvider")
    public Object[][] endsLyDataProvider(){
        return new Object[][]{
                {"oddly", true},
                {"y", false},
                {"oddy", false},
                {"oddl", false},
                {"olydd", false},
                {"ly", true},
                {"", false},
                {"falsey", false},
                {"evenly", true},

        };
    }
}
