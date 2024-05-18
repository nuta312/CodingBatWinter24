package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.Left2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Left2Test {

    @Test(dataProvider = "left2Provider")
    public void testLeft2(String str, String expected){
        Assert.assertEquals(Left2.left2(str), expected);
    }
    @DataProvider
    public Object[][] left2Provider(){
        return new Object[][]{
                {"Hello","lloHe"},
                {"java", "vaja"},
                {"cat", "tca"},
                {"12345","34512"}
        };
    }
}

