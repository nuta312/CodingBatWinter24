package aijan.string1_test;

import com.digital_nomads.aijan.string1.ExtraFront;
import com.digital_nomads.aijan.string1.MinCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraFrontTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"Hello", "HeHeHe"},
                {"ab", "ababab"},
                {"H", "HHH"},
                {"", ""},
                {"Candy", "CaCaCa"},
                {"Code", "CoCoCo"},
        };
    }

    @Test(dataProvider = "word")
    public void testExtraFront(String str, String expectedResult) {
        ExtraFront obj = new ExtraFront();
        String actualResult = obj.extraFront(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
}