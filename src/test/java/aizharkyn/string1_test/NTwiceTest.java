package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.NTwice;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NTwiceTest {

    @Test(dataProvider = "nTwiceProvider")
    public void testNTwice(String str, int n, String expected){
        Assert.assertEquals(NTwice.nTwice(str, n), expected);
    }

    @DataProvider
    public Object[][] nTwiceProvider(){
        return new Object[][]{
                {"Hello", 2, "Helo"},
                {"Chocolate", 3, "Choate"},
                {"Hello", 4, "Hellello"	}
        };
    }
}
