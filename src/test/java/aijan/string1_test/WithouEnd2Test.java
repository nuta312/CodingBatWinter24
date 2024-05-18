package aijan.string1_test;

import com.digital_nomads.aijan.string1.WithouEnd2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithouEnd2Test {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"Hello","ell"},
                {"abc","b"},
                {"ab",""},
                {"a",""},
                {"",""},
                {"coldy","old"},
                {"java code","ava cod"},
        };

    }

    @Test(dataProvider = "word")
    public void testNonStart(String str, String expectedResult) {
        WithouEnd2 obj = new WithouEnd2();
        String actualResult = obj.withouEnd2(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
