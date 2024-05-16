package meka.string1_test;

import com.digital_nomads.meka.string1.MiddleTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleTwoTest {

    @Test(dataProvider = "testData")
    public void testMiddleTwo(String str, String expected) {
        MiddleTwo middleTwo = new MiddleTwo();
        String result = middleTwo.middleTwo(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"string", "ri"},
                {"code", "od"},
                {"Practice", "ct"},
                {"ab", "ab"},
                {"0123456789", "45"}
        };
    }
}
