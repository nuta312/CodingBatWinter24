package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.ExtraFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraFrontTest {

    @Test(dataProvider = "extraFrontProvider")
    public void testExtraFront(String str, String expected){
        Assert.assertEquals(ExtraFront.extraFront(str), expected);
    }

    @DataProvider
    public Object[][] extraFrontProvider(){
        return new Object[][]{
                {"Hello","HeHeHe"},
                {"ab","ababab"},
                {"H","HHH"},
                {"",""},
                {"Candy","CaCaCa"},
                {"Code", "CoCoCo"}
        };
    }
}
