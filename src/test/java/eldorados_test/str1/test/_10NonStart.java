package eldorados_test.str1.test;

import com.digital_nomads.eldorado.str1.NonStart;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _10NonStart {
    @Test(dataProvider = "NST")
    public void testNonStart(String a, String b, String e){
        NonStart ns = new NonStart();
        String res = ns.nonString(a, b);
        assert res.equals(e);
    }

    @DataProvider
    public Object[][] NST(){
        return new Object[][] {
                {"Hello","There","ellohere"},
                {"java","code","avaode"},
                {"shotl","java","hotlava"},
        };
    }
}
