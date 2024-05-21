package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.AtFirst;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AtFirstTest {

    @Test(dataProvider = "atFirstProvider")
    public void testAtFirst(String str,  String expected){
        Assert.assertEquals(AtFirst.atFirst(str), expected);
    }

    @DataProvider
    public Object[][] atFirstProvider(){
        return new Object[][]{
                {"hello", "he"	},
                {"hi", "hi"},
                {"h",  "h@"},
                {"", "@@"},
                {"j", "j@"},
        };
    }
}
