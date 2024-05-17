package meka.string1_test;

import com.digital_nomads.meka.string1.SeeColor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeeColorTest {

    @Test(dataProvider = "testData")
    public void testSeeColor(String str, String expected) {
        SeeColor seeColor = new SeeColor();
        String result = seeColor.seeColor(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
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
