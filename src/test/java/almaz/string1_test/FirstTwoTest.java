package almaz.string1_test;

import com.digital_nomads.almaz.string1.FirstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTwoTest {
    @Test(dataProvider = "FirstTwoTest")
    public void testFirstTwo(String str, String expected){
        FirstTwo firstTwo = new FirstTwo();
        String result = firstTwo.firstTwo(str);
        assert result.equals(expected);
    }

    @DataProvider
    public Object [][] FirstTwoTest(){
        return new Object[][]{
                {"Hello", "He"},
                {"abcdefg", "ab"},
                {"ab", "ab"},
                {"", ""},
        };
    }
}
