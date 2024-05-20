package Gaukhar.String1;

import com.digital_nomads.gaukhar.string1.firstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class firstHalfTest {
    @Test
            (dataProvider = "half")
    public void hulf (String str, String e){
        firstHalf h = new firstHalf();
        String m = h.firstHalf(str);
        Assert.assertEquals(m , e);



    }
    @DataProvider
    public Object [][] half(){
        return new Object[][]{
                {"WooHoo", "Woo"},
                {"HelloThere","Hello"},
                {"abcdef","abc"},
                {"ab","a"},
                {"",""},
                {"0123456789","01234"},
                {"kitten","kit"},
        };
    }
}
