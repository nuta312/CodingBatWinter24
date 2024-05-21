package eldorados_test.str1.test;

import com.digital_nomads.eldorado.str1.ExtraEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _5ExtraEnd {
    @Test(dataProvider = "EET")
    public void testExtraEnd(String a, String e){
        ExtraEnd ee = new ExtraEnd();
        String res = ee.extraEnd(a);
        assert res.equals(e);
    }



    @DataProvider
    public Object[][] EET(){
        return new Object[][]{
                {"Hello","lololo"},
                {"ab","ababab"},
                {"Hi","HiHiHi"},
        };
    }
}
