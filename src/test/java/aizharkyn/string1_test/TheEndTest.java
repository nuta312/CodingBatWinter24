package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.TheEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TheEndTest {

    @Test(dataProvider = "theEndProvider")
    public void testTheEnd(String str, boolean front, String expected){
        Assert.assertEquals(TheEnd.theEnd(str, front), expected);
    }

    @DataProvider
    public Object[][] theEndProvider(){
        return new Object[][]{
                {"Hello", true, "H"},
                {"Salam", false, "m"},
                {"oh", false ,"h"},
                {"chocolate", false, "e"}

        };
    }
}
