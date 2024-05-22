package nurs.string1_test;

import com.digital_nomads.nurs.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {
    @DataProvider(name = "words")
    public Object [][] provideWord(){
        return new Object[][]{
                {"WooHoo", "Woo"},
                {"HelloThere", "Hello"},
                {"abcdef", "abc"},
                {"", ""},
                {"WooHoo", "Woo"},
                {"0123456789", "01234"},
                {"kitten", "kit"},
        };
    }
    @Test(dataProvider = "words")
    public void testFirstHalf(String str, String expectedResult) {
        FirstHalf obj = new FirstHalf();
        String actualResult = obj.firstHalf(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
