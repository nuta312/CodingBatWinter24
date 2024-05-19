package eldorados_test.str1.test;

import com.digital_nomads.eldorado.str1.Rigtj2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class __12Rigth2 {
    @Test(dataProvider = "R2T")
    public void testRight2 (String a, String e){
        Rigtj2 r2 = new Rigtj2();
        String res = r2.rigth2(a);
        assert res.equals(e);
    }



    @DataProvider
    public Object [][] R2T (){
        return new Object[][]{
                {"Hello","loHel"},
                {"java","vaja"},
                {"Hi","Hi"},
        };
    }

}
