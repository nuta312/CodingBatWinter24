package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.FirstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTwoTest {

    FirstTwo firstTwo = new FirstTwo();

    @DataProvider(name = "getFirstTwo")
    public Object[][] getFirstTwo(){
        return new Object[][]{
                {"Hello", "He"},
                {"abcdefg", "ab"},
                {"ab", "ab"}
        };
    }

    @Test(dataProvider = "getFirstTwo")
    public void testFirstTwo(String str, String expected){
        Assert.assertEquals(firstTwo.firstTwo(str),expected);
    }
}
