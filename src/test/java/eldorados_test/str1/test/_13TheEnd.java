package eldorados_test.str1.test;

import com.digital_nomads.eldorado.str1.TheEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _13TheEnd {
    @Test(dataProvider = "TET")
    public void testTheEnd (String str, boolean a, String exc){
        TheEnd te = new TheEnd();
        String res = te.theEnd(str,a);
        assert res.equals(exc);
    }

    @DataProvider
    public Object [][] TET(){
        return new Object[][]{
                {"Hello", true , "H"},
                {"Hello", false , "o"},
                {"oh", true , "o"},
        };
    }
}
