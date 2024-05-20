package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.HasBed;
import com.digital_nomads.zafura.string1.SeeColor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeeColorTest {
    @Test(dataProvider = "color")
    public void testSeeColot(String str,  String expected) {
        SeeColor seeColor = new SeeColor();
        Assert.assertEquals(seeColor.seeColor(str), expected);
    }

    @DataProvider
    public Object[][] color() {

        return new Object[][]{
                {"redxx","red"},
                {"red", "red"},
                {"xyzred", ""},
        };
    }
}


