package almaz.string1_test;

import com.digital_nomads.almaz.string1.FirstHalf;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {

    @Test(dataProvider = "FirstHalfTest")
    public void testFirstHalf(String str, String expected){
        FirstHalf firstHalf = new FirstHalf();
        String result = firstHalf.firstHalf(str);
        assert result.equals(expected);
    }

    @DataProvider
    public Object [][] FirstHalfTest() {
        return new Object[][]{
                {"WooHoo", "Woo"},
                {"HelloThere", "Hello"},
                {"abcdef", "abc"},
                {"ab", "a"},
                {"0123456789", "01234"},
        };
    }
}
