package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {

    @Test (dataProvider = "firstHalfDataProvider")
    public void firstHalfTest(String str, String expected){
        FirstHalf firstHalf = new FirstHalf();
        Assert.assertEquals(firstHalf.firstHalf(str), expected);
    }

    @DataProvider (name = "firstHalfDataProvider")
    public Object[][] firstHalfDataProvider(){
        return new Object[][]{
                {"WooHoo", "Woo"},
                {"HelloThere", "Hello"},
                {"abcdef", "abc"},
                {"ab", "a"},
                {"0123456789", "01234"},
                {"kitten", "kit"},
                {"", ""}
        };
    }

}
