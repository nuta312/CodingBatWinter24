package eldorados_test.str1.test;

import com.digital_nomads.eldorado.str1.MiddleTwo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _15MiddleTwo {
    @Test(dataProvider = "MTT")
public void testMiddleTwo (String str, String exc){
        MiddleTwo mt = new MiddleTwo();
        String res = mt.middleTwo(str);
        assert res.equals(exc);
    }
    @DataProvider
    public Object[][] MTT(){
        return new Object[][]{
                {"string","ri"},
                {"code","od"},
                {"Practice","ct"},
        };
    }
}
