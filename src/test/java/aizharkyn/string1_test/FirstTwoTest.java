package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.FirstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class FirstTwoTest {

    @Test(dataProvider = "firstTwoProvider")
    public void testFirstTwo(String str , String expected){
        Assert.assertEquals(FirstTwo.firstTwo(str), expected);
    }

    @DataProvider
    public Object [] [] firstTwoProvider(){
        return new Object[][]{
                {"Hello", "He"},
                {"Icy", "Ic"},
                {"Summer", "Su"},
                {"Winter", "Wi"},
                {"", ""}


        };
    }
}
