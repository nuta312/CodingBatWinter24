package aima.string1_test;

import com.digital_nomads.aima.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {
    @Test (dataProvider = "words")
    public void firstHalf(String str, String expected) {
        FirstHalf firstHalf = new FirstHalf();
        Assert.assertEquals(firstHalf.firstHalf(str), expected);
    }
    @DataProvider(name = "words")
    public Object[][] providerWords() {
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
