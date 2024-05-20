package aijan.string1_test;

import com.digital_nomads.aijan.string1.MiddleTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleTwoTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"string", "ri"},
                {"code", "od"},
                {"Practice", "ct"},
                {"ab", "ab"},
                {"0123456789", "45"}
        };

    }

    @Test(dataProvider = "word")
    public void testNonStart(String str, String expectedResult) {
        MiddleTwo obj = new MiddleTwo();
        String actualResult = obj.middleTwo(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
