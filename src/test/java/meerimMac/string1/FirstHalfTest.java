package meerimMac.string1;

import com.digital_nomads.meerimMac.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"WooHoo", "Woo"},
                {"HelloThere", "Hello"},
                {"0123456789", "01234"}

        };

    }

    @Test(dataProvider = "word")
    public void firstHalf(String some, String exp) {
        String actual = FirstHalf.firstHalf(some);
        Assert.assertEquals(actual, exp);


    }
}
