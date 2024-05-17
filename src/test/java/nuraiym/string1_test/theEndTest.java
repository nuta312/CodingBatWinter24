package nuraiym.string1_test;

import com.digital_nomads.nuraiym.string1.TheEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class theEndTest {
    @Test(dataProvider = "theEndDataProvider")
    public void testTheEnd(String str, boolean front, String expected) {
        TheEnd theEnd = new TheEnd();
        String result = theEnd.theEnd(str, front);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "theEndDataProvider")
    public Object[][] theEndDataProvider() {
        return new Object[][]{
                {"Hello", true, "H"},
                {"Hello", false, "o"},
                {"oh", true, "o"},
                {"oh", false, "h"},
                {"x", true, "x"},
                {"x", false, "x"},
                {"java", true, "j"},
                {"chocolate", false, "e"},
                {"1234", true, "1"},
                {"code", false, "e"}
        };
    }
}
