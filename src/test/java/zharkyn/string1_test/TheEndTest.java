package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.TheEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TheEndTest {

    @Test (dataProvider = "theEndDataProvider")
    public void theEnd(String str, boolean front, String expected){
        TheEnd theEnd = new TheEnd();
        Assert.assertEquals(theEnd.theEnd(str, front), expected);
    }

    @DataProvider (name = "theEndDataProvider")
    public Object[][] theEndDataProvider (){
        return new Object[][]{
                {"Hello", true, "H"},
                {"Hello", false, "o"},
                {"oh", true, "o"},
                {"oh", false, "h"},
                {"x", true, "x"},
                {"x", false, "x"},
                {"java", true, "j"},
                {"chocolate", false, "e"},
                {"1234", true, "1"},
                {"code", false, "e"}
        };
    }
}
