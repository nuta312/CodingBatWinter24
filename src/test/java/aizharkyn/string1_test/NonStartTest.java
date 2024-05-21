package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NonStartTest {

    @Test(dataProvider = "nonStartProvider")
    public void testNonStart(String a, String b, String expected){
        NonStart nonstart = new NonStart();
        Assert.assertEquals(nonstart.nonStart(a,b), expected);
    }

    @DataProvider
    public Object[][] nonStartProvider(){
        return new Object[][]{
                {"Hello", "There", "ellohere"},
                {"java", "code","avaode"},
                {"ab", "xy","by"},
                {"x", "ac", "c"},
                {"mart", "dart","artart" }
        };
    }
}
