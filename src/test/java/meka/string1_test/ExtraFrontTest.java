package meka.string1_test;

import com.digital_nomads.meka.string1.ExtraFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraFrontTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"Hello", "HeHeHe"},
                {"ab", "ababab"},
                {"H", "HHH"},
                {"", ""},
                {"Candy", "CaCaCa"},
                {"Code", "CoCoCo"}
        };
    }

    @Test(dataProvider = "testData")
    public void testExtraFront(String input, String expected) {
        ExtraFront extraFront = new ExtraFront();
        String result = extraFront.extraFront(input);
        Assert.assertEquals(result, expected);
    }
}
