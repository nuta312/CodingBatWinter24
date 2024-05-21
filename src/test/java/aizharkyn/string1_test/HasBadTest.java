package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.HasBad;
import com.digital_nomads.aizharkyn.string1.MiddleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasBadTest {

    @Test(dataProvider = "hasBadProvider")
    public void testHasBad(String str,  boolean expected){
        Assert.assertEquals(HasBad.hasBad(str), expected);
    }

    @DataProvider
    public Object[][] hasBadProvider(){
        return new Object[][]{
                {"badxx", true	},
                {"xbadxx", true},
                {"code",  false},
                {"ba", false}
        };
    }
}
