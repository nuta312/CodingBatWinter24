package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.TheEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TheEndTest {

    TheEnd theEnd = new  TheEnd();

    @DataProvider(name = "getTheEnd")
    public Object[][]getTheEnd(){
        return new Object[][]{
                {"Hello", true, "H"},
                {"Hello", false, "o"},
                {"oh", true, "o"}
        };
    }

    @Test(dataProvider = "getTheEnd")
    public void testTheEnd(String str, boolean front, String expected){
        String result = theEnd.theEnd(str, front);
        assertEquals(result, expected);
    }

}