package aizharkyn.string1_test;


import com.digital_nomads.aizharkyn.string1.SeeColor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeeColorTest {
    @Test(dataProvider = "seeColorProvider")
    public void testSeeColor(String str,  String expected){
        Assert.assertEquals(SeeColor.seeColor(str), expected);
    }

    @DataProvider
    public Object[][] seeColorProvider(){
        return new Object[][]{
                {"redxx", "red"	},
                {"xxred", ""},
                {"blueTimes", "blue"},
                {"NoColor", ""},
                {"a", ""},
                {"xyzred", ""}
        };
    }

}
