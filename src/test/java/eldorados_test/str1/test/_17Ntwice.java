package eldorados_test.str1.test;

import com.digital_nomads.eldorado.str1.NTwice;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _17Ntwice {
    @Test(dataProvider = "NTT")
    public void testNTwice(String s, int n, String e){
        NTwice nt = new NTwice();
        String res = nt.nTwice(s,n);
        assert res.equals(e);
    }

    @DataProvider
    public Object[][] NTT (){
        return new Object[][]{
                {"Hello",2,"Helo"},
                {"Chocolate",3,"Choate"},
                {"Chocolate",1,"Ce"},
        };
    }
}
