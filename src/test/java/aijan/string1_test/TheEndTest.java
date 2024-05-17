package aijan.string1_test;

import com.digital_nomads.aijan.string1.Right2;
import com.digital_nomads.aijan.string1.TheEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TheEndTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
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

    @Test(dataProvider = "word")
    public void testNonStart(String str, boolean front, String expectedResult) {
        TheEnd obj = new TheEnd();
        String actualResult = obj.theEnd(str, front);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
