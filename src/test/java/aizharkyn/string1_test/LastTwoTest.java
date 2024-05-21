package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.LastTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastTwoTest {
    @Test(dataProvider = "lastTwoProvider")
    public void TestLastTwo(String str,  String expected){
        Assert.assertEquals(LastTwo.lastTwo(str), expected);
    }

    @DataProvider
    public Object[][] lastTwoProvider(){
        return new Object[][]{
                {"coding", "codign"	},
                {"cat", "cta"},
                {"ab",  "ba"},
                {"", ""},
                {"a", "a"}
        };
    }
}
