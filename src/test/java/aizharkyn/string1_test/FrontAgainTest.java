package aizharkyn.string1_test;


import com.digital_nomads.aizharkyn.string1.FrontAgain;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontAgainTest {
    @Test(dataProvider = "frontAgainProvider")
    public void testFrontagain(String str,  boolean expected){
        Assert.assertEquals(FrontAgain.frontAgain(str), expected);
    }

    @DataProvider
    public Object[][] frontAgainProvider(){
        return new Object[][]{
                {"edited", true},
                {"edit", false},
                {"ed", true},
                {"jj", true},
                {"jjjk", false},
                {"java", false}
        };
    }

}
