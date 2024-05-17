package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.TheEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TheEndTest {
    TheEnd theEnd = new TheEnd();

    @Test(dataProvider = "theEnd")
    public void testTheEnd(String str, boolean front, String expected) {

        Assert.assertEquals(theEnd.theEnd(str, front), expected);
    }

    @DataProvider
    public Object[][] theEnd() {
        return new Object[][]{
                {"Hello", true, "H"},
                {"oh", true, "o"},
                {"oh", false, "h"},
                {"x", true, "x"},
                {"x", false, "x"},
                {"java", true, "j"},
                {"chocolate", false, "e"},
                {"1234", true, "1"},
                {"code", false, "e"},
        };
    }
}
