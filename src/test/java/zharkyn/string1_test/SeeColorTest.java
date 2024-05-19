package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.LastTwo;
import com.digital_nomads.zharkyn.string1.SeeColor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeeColorTest {

    @Test(dataProvider = "seeColorDataProvider")
    public void seeColorTest(String str, String expected){
        SeeColor seeColor = new SeeColor();
        Assert.assertEquals(seeColor.seeColor(str), expected);
    }

    @DataProvider(name = "seeColorDataProvider")
    public Object[][] seeColorDataProvider(){
        return new Object[][] {
                {"redxx", "red"},
                {"xxred", ""},
                {"blueTimes", "blue"},
                {"NoColor", ""},
                {"red", "red"},
                {"re", ""},
                {"blu", ""},
                {"blue", "blue"},
                {"a", ""},
                {"", ""},
                {"xyzred", ""}
        };
    }

}
