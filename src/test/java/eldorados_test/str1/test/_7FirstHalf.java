package eldorados_test.str1.test;

import com.digital_nomads.eldorado.str1.FirstHalf;
import com.digital_nomads.eldorado.str1.FirstTwo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _7FirstHalf {
    @Test(dataProvider = "FHT")
    public void testFirstHalf (String str, String exc){
        FirstHalf fh = new FirstHalf();
        String res = fh.firstHalf(str);
        assert res.equals(exc);
    }


    @DataProvider
    public Object[][] FHT(){
        return new Object[][]{
                {"WooHoo","Woo"},
                {"HelloThere","Hello"},
                {"abcdef","abc"},
        };

    }
}
