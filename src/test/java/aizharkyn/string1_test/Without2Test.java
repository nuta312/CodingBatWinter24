package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.Without2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Without2Test {

    @Test(dataProvider = "without2Provider")
    public void testWithout2(String str, String expected){
        Assert.assertEquals(Without2.without2(str), expected);
    }

    @DataProvider
    public Object[][] without2Provider(){
        return new Object[][]{
                {"HelloHe","lloHe"},
                {"HelloHi","HelloHi"},
                {"Hi",""},
                {"Chocolate","Chocolate"},
                {"xxx","x"},
                {"", ""}
        };
    }
}
