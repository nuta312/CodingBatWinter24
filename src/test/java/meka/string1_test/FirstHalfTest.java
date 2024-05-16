package meka.string1_test;

import com.digital_nomads.meka.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {


    @Test(dataProvider = "testData")
    public void testFirstHalf(String str, String expected){
        FirstHalf firstHalf = new FirstHalf();
        String result = firstHalf.firstHalf(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"WooHoo", "Woo"},
                {"HelloThere", "Hello"},
                {"abcdef", "abc"},
                {"ab", "a"},
                {"", ""},
                {"0123456789", "01234"},
                {"kitten", "kit"},
        };
    }
}
