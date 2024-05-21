package aisuluu.string1_test;

import digital_nomads.aisuluu.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {
    @Test(dataProvider = "firsth")
    public void TestFirstHalf (String str, String exp){
        FirstHalf firsthalf = new FirstHalf();
        Assert.assertEquals(firsthalf.firstHalf(str),exp);
    }
    @DataProvider
    public String[][] firsth(){
        return new String[][]{
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
