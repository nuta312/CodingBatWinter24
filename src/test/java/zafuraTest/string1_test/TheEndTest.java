package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.RightTwo;
import com.digital_nomads.zafura.string1.TheEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TheEndTest {
    @Test(dataProvider = "end")
    public void testTheEnd(String str,boolean front, String expected) {
        TheEnd theEnd = new TheEnd();
        Assert.assertEquals(theEnd.theEnd(str,front),expected);
    }
    @DataProvider
    public Object[][]end(){
        return new Object[][]{
                {"Hello", true, "H"},
                {"Hello", false,"o"},
                {"1234", true, "1"},


        };
    }
}
