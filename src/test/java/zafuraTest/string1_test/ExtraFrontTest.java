package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.ExtraFront;
import com.digital_nomads.zafura.string1.MinCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraFrontTest {
    @Test(dataProvider = "extra")
    public void testExtraFront(String str,  String expected) {
        ExtraFront extraFront = new ExtraFront();
        Assert.assertEquals(extraFront.extraFront(str), expected);
    }

    @DataProvider
    public Object[][] extra() {

        return new Object[][]{
                {"Hello","HeHeHe"},
                {"ab","ababab"},
                {"",""},
        };
    }
}

