package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.TwoChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoCharTest {

    @Test(dataProvider = "twoCharProvider")
    public void testTwoChar(String str, int index, String expected){
        Assert.assertEquals(TwoChar.twoChar(str, index), expected);
    }

    @DataProvider
    public Object[][] twoCharProvider(){
        return new Object[][]{
                {"java", 0, "ja"},
                {"java", -1, "ja"},
                {"Hello", 0, "He"},
                {"Hello", 3, "lo"},
                {"Hello", 5, "He"}
        };
    }
}
