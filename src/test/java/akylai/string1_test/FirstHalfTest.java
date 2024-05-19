package akylai.string1_test;

import com.digital_nomads.akylai.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {

    FirstHalf firstHalf = new FirstHalf();

    @Test(dataProvider = "firstHalfTest")
    public void firstHalf(String str) {
        int res = str.length()/2;
        System.out.println(str. substring(0,res));
        Assert.assertEquals(firstHalf.firstHalf(str),str.substring(0,res));
    }

    @DataProvider
    public String[][] firstHalfTest(){
        return new String[][]{
                {"WooHoo"},
                {"HelloThere"},
                {"abcdef"},
                {"ab"},
                {""},
                {"0123456789"},
                {"kitten"}
        };
    }
}
