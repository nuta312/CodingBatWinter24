package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEndTest {

    @Test(dataProvider = "endProvider" )
    public void testWithoudEnd(String str, String expected){
        Assert.assertEquals(WithoutEnd.withoutEnd(str), expected);
    }

    @DataProvider
    public Object[][] endProvider(){
        return new Object[][]{
                {"Hello", "ell"},
                {"java", "av"},
                {"Chocolate!", "hocolate"},
        };

    }
}
