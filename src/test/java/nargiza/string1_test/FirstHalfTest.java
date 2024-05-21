package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.FirstHalf;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FirstHalfTest {

    FirstHalf firstHalf = new FirstHalf();

    @DataProvider(name = "getFirstHalf")
    public Object[][] getFirstHalf(){
        return new Object[][]{
                {"WooHoo", "Woo"},
                {"HelloThere", "Hello"},
                {"abcdef", "abc"}
        };
    }

    @Test(dataProvider = "getFirstHalf")
    public void testFirstHalf(String str, String expected){
        assertEquals(firstHalf.firstHalf(str), expected);
    }

}