package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.FirstHalf;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FirstHalfTest {

    @Test(dataProvider = "firstHalfDataProvider")
    public void firstHalfTest(String str, String expected) {

        var firstHalf = new FirstHalf();
        assertEquals(firstHalf.firstHalf(str), expected);
    }

    @DataProvider(name = "firstHalfDataProvider")
    public String[][] firstHalfDataProvider() {
        return new String[][]{

                {"WooHoo", "Woo"},
                {"HelloThere", "Hello"},
                {"abcdef", "abc"},
                {"ab", "a"},
                {"0123456789", "01234"},
                {"kitten", "kit"}
        };
    }
}
