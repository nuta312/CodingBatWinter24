package demo.String1_Test;

import com.digital_nomads.shirin.string1.FrontAgain;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontAgainTest {

    @Test(dataProvider = "FrontAgain")
    public void TestFrontAgain (String str , boolean except){
        FrontAgain again = new FrontAgain();
        Assert.assertEquals(again.frontAgain(str),except);
    }


    @DataProvider
    public Object[][] FrontAgain(){
        return new Object[][]{
                {"edited", true},
                {"edit", false},
                {"ed" ,true},
                {"jj" ,true},
                {"jjj",true}
        };
    }
}
