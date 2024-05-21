package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {
    FirstHalf firstHalf = new FirstHalf();

    @Test(dataProvider = "firstHalf")
    public void testFirstHalf(String str, String expected) {

        Assert.assertEquals(firstHalf.firstHalf(str), expected);
    }

    @DataProvider(name = "firstHalf")
    public Object[][] firstHalf() {
        return new Object[][]{
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
