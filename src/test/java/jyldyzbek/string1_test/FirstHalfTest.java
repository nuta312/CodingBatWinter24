package jyldyzbek.string1_test;

import com.digital_nomads.jyldyzbek.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {

    @Test(dataProvider = "firstHalf")
    public void firstHalfTestMethod(String str, String str1){
        FirstHalf firstHalf = new FirstHalf();
        String result = firstHalf.firstHalf(str);
        assert result.equals(str1);
    }
    @DataProvider
    public Object[][]firstHalf(){
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
