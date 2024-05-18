package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.AtFirst;
import com.digital_nomads.aizharkyn.string1.LastChars;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastCharsTest {

    @Test(dataProvider = "lastCHarsProvider")
    public void testLastCHars(String a, String b,  String expected){
        Assert.assertEquals(LastChars.lastChars(a,b), expected);
    }

    @DataProvider
    public Object[][] lastCHarsProvider(){
        return new Object[][]{
                {"last", "chars","ls"},
                {"yo", "java","ya"},
                {"hi", "", "h@"},
                {"", "hello","@o"},
        };
    }
}
