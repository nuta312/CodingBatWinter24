package eldorados_test.str1.test;

import com.digital_nomads.eldorado.str1.WithoutEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _8WithoutEnd {
    @Test(dataProvider = "WET")
public void testWithoutEnd (String str, String exc){
        WithoutEnd we = new WithoutEnd();
        String res = we.witoutEnd(str);
        assert res.equals(exc);
    }
    @DataProvider
    public Object[][] WET(){
        return new Object[][]{
                {"Hello","ell"},
                {"java","av"},
                {"coding","odin"},
        };
    }
}
