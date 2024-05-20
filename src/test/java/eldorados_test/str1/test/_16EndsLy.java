package eldorados_test.str1.test;

import com.digital_nomads.eldorado.str1.EndsLy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _16EndsLy {
    @Test(dataProvider = "ELT")
    public void testEndsLy (String str, boolean exc){
        EndsLy el = new EndsLy();
        boolean res = el.endsLy(str);
        assert res == exc;
    }


    @DataProvider
    public Object[][] ELT(){
        return new Object[][]{
                {"oddly", true},
                {"o", false},
                {"oddy", false},
        };
    }
}
