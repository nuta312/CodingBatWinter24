package meka.string1_test;

import com.digital_nomads.meka.string1.TheEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TheEndTest {

    @Test(dataProvider = "testData")
    public void testTheEnd(String str, boolean front, String expected) {
        TheEnd theEnd = new TheEnd();
        String result = theEnd.theEnd(str, front);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"Hello", true, "H"},
                {"Hello", false, "o"},
                {"oh", true, "o"},
                {"oh", false, "h"},
                {"x", true, "x"},
                {"x", false, "x"},
                {"java", true, "j"},
                {"code", false, "e"}
        };
    }
}
