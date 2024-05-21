package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.ExtraFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraFrontTest {

    @Test(dataProvider = "extraFrontDataProvider")
    public void extraFrontTest(String str, String expected){
        ExtraFront extraFront = new ExtraFront();
        Assert.assertEquals(extraFront.extraFront(str), expected);
    }

    @DataProvider(name = "extraFrontDataProvider")
    public Object[][] extraFrontDataProvider() {
        return new Object[][]{
                {"Hello", "HeHeHe"},
                {"ab", "ababab"},
                {"H", "HHH"},
                {"", ""},
                {"Candy", "CaCaCa"},
                {"Code", "CoCoCo"}
        };
    }
}
