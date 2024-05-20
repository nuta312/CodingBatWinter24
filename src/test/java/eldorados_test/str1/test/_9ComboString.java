package eldorados_test.str1.test;

import com.digital_nomads.eldorado.str1.ComboString;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _9ComboString {
    @Test(dataProvider = "CST")
    public void testComboString (String a, String b, String e){
        ComboString cs = new ComboString();
        String res = cs.comboString(a,b);
        assert res.equals(e);
    }

    @DataProvider
    public Object[][] CST(){
        return new Object[][]{
                {"hi","Hello","hiHellohi"},
                {"Hello","hi","hiHellohi"},
                {"aaa","b","baaab"},
        };
    }
}
