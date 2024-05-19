package aima.string1_test;

import com.digital_nomads.aima.string1.LeftTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LeftTwoTest {
    @Test(dataProvider = "words")
    public void leftTwo(String str, String expected){
        LeftTwo leftTwo = new LeftTwo();
        Assert.assertEquals(leftTwo.leftTwo(str), expected);
    }
@DataProvider (name = "words")
    public Object[][] provideWords(){
        return new Object[][]{
                {"Hello", "lloHe"},
                {"java", "vaja"},
                {"Hi", "Hi"},
                {"code", "deco"},
                {"cat", "tca"},
                {"12345", "34512"},
                {"Chocolate", "ocolateCh"},
                {"bricks", "icksbr"},
        };
}
}