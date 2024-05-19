package eldorados_test.str1.test;

import com.digital_nomads.eldorado.str1.Left2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _11Left2 {
    @Test(dataProvider = "L2T")
    public void testLeft2(String str, String exc) {
        Left2 l2 = new Left2();
        String res = l2.left2(str);
        assert res.equals(exc);
    }

    @DataProvider
    public Object [][] L2T(){
        return new Object[][]{
                {"Hello","lloHe"},
                {"java","vaja"},
                {"Hi","Hi"},
        };
    }
}
