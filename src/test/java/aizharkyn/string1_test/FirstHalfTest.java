package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {

    @Test(dataProvider = "firstHalfProvider")
    public void testFirstHalf(String str, String expected){
        Assert.assertEquals(FirstHalf.firstHalf(str), expected);
    }

    @DataProvider
    public Object [] [] firstHalfProvider(){
        return new Object[][]{
                {"WooHoo", "Woo"},
                {"HelloThere", "Hello"},
                {"SalamAleik", "Salam"},
                {"ab", "a"},
                {"", ""},
                {"12334565","1233"}
        };
    }
}
