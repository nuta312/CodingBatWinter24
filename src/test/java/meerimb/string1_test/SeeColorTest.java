package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.SeeColor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeeColorTest {

    SeeColor seeColor = new SeeColor();

    @Test(dataProvider = "seeColor")
    public void testSeeColor(String str, String expected) {

        Assert.assertEquals(seeColor.seeColor(str), expected);
    }

    @DataProvider
    public Object[][] seeColor() {
        return new Object[][]{
                {"redxx", "red"},
                {"xxred", ""},
                {"blueTimes", "blue"},
                {"NoColor", ""},
                {"red", "red"},
                {"re", ""},
                {"blue", "blue"},
                {"a", ""},
                {"", ""},
                {"xyzred", ""},
        };
    }
}
