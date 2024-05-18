package nuraiym.string1_test;

import com.digital_nomads.nuraiym.string1.firstHalf;
import com.digital_nomads.nuraiym.string1.firstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {

    @Test(dataProvider = "firstHalf")
    public void testFirstHalf(String str, String expected) {
        firstHalf firstHalf = new firstHalf();
        String result = firstHalf.firstHalf(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "firstHalf")
    public Object[][] firstHalfDataProvider() {
        return new Object[][]{
                {"WooHoo", "Woo"},
                {"HelloThere", "Hello"},
                {"abcdef", "abc"},
                {"ab", "a"},
                {"", ""},
                {"0123456789", "01234"},
                {"kitten", "kit"}
        };
    }
}
