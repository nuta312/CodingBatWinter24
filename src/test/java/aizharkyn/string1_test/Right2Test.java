package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.Right2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Right2Test {

    @Test(dataProvider = "right2Provider")
    public void testRight2(String str, String expected){
        Assert.assertEquals(Right2.right2(str), expected);
    }

    @DataProvider
    public Object [][] right2Provider(){
        return new Object[][]{
                {"Hello", "loHel"},
                {"java","vaja"},
                {"code", "deco"},
                {"12345", "45123"}
        };
    }
}
