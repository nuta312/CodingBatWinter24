package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.ExtraFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraFrontTest {

    ExtraFront extraFront = new ExtraFront();

    @Test(dataProvider = "extraFront")
    public void testExtraFront(String str, String expected) {

        Assert.assertEquals(extraFront.extraFront(str), expected);
    }

    @DataProvider
    public Object[][] extraFront() {
        return new Object[][]{
                {"Hello", "HeHeHe"},
                {"ab", "ababab"},
                {"H", "HHH"},
                {"", ""},
                {"Candy", "CaCaCa"},
                {"Code", "CoCoCo"},
        };
    }
}
