package nuraiym.string1_test;

import com.digital_nomads.nuraiym.string1.seeColor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeeColorTest {
    @Test(dataProvider = "seeColorDataProvider")
    public void testSeeColor(String str, String expected) {
        seeColor seeColor = new seeColor();
        String result = seeColor.seeColor(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "seeColorDataProvider")
    public Object[][] seeColorDataProvider() {
        return new Object[][]{
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
