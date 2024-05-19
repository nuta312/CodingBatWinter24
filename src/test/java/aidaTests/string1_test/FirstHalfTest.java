package aidaTests.string1_test;

import com.digital_nomads.almaz.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {

    @Test(dataProvider = "values")
   public void testFirstHalf(String str, String expectedResult){
        FirstHalf firstHalf = new FirstHalf();
        Assert.assertEquals(firstHalf.firstHalf(str), expectedResult);
    }

    @DataProvider
    public Object [][] values(){
        return new Object[][]{
                {"WooHoo","Woo"},
                {"HelloThere", "Hello"},
                {"abcdef", "abc"},
                {"ab","a"},
                {"", ""},
                {"0123456789", "01234"},
                {"kitten","kit"}
        };
    }
}
