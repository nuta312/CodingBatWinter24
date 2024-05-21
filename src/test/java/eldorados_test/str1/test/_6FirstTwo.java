package eldorados_test.str1.test;

import com.digital_nomads.eldorado.str1.FirstTwo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _6FirstTwo {
    @Test(dataProvider = "FTT")
    public void testFirstTwo(String str, String exp){
        FirstTwo ft = new FirstTwo();
        String res = ft.firstTwo(str);
        assert res.equals(exp);
    }


    @DataProvider
    public Object[][] FTT(){
        return new Object[][]{
                {"Hello","He"},
                {"abcdefg","ab"},
                {"ab","ab"},
        };
    }
}
