package tais.string1_test;

import com.digital_nomads.tais.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {


    @Test(dataProvider = "dPfirstHalfTest")
    public void firstHalfTest(String str1, String expected){
        FirstHalf objFirstHalf = new FirstHalf();
        Assert.assertEquals(objFirstHalf.firstHalf(str1), expected);
    }


    @DataProvider
    public Object[][] dPfirstHalfTest(){
        return new Object[][]{
                {"Woohoo", "Woo"},
                {"HelloThere", "Hello"},
                {"Woohoo", "Woo"},
                {"Woohoo", "Woo"},
                {"Woohoo", "Woo"},
                {"Woohoo", "Woo"},
                {"Woohoo", "Woo"}
        };
    }
}
