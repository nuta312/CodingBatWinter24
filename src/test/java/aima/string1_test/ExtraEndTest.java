package aima.string1_test;

import com.digital_nomads.aima.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {
    @Test(dataProvider = "words")
    public void extraEnd(String str, String expected){
        ExtraEnd extraEnd = new ExtraEnd();
        Assert.assertEquals(extraEnd.extraEnd(str), expected);
    }

    @DataProvider (name = "words")
    public Object[][] provideWords(){
        return new Object[][]{
                {"Hello", "lololo"},
                {"ab", "ababab"},
                {"Candy", "dydydy"},
                {"Code", "dedede"}
        };
    }
}
