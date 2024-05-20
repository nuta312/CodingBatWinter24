package eldorados_test.str1.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _14WithoutEnd2 {
    @Test

    @DataProvider
    public Object[][] WET(){
        return new Object[][]{
                {"Hello","ell"},
                {"abc","b"},
                {"ab",""},
        };
    }
}
