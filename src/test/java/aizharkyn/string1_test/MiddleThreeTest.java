package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.MiddleThree;
import com.digital_nomads.aizharkyn.string1.TwoChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleThreeTest {

    @Test(dataProvider = "middleThreeProvider")
    public void testMiddleThree(String str,  String expected){
        Assert.assertEquals(MiddleThree.middleThree(str), expected);
    }

    @DataProvider
    public Object[][] middleThreeProvider(){
        return new Object[][]{
                {"Candy", "and"	},
                {"solving", "lvi"},
                {"Hi yet Hi",  "yet"},
                {"Chocolate", "col"	},
        };
    }
}
