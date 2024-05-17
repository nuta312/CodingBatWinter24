package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.FirstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTwoTest {

    @Test(dataProvider = "firstTwoDataProvider")
    public void firstTwoTest(String str, String expected){
        FirstTwo firstTwo = new FirstTwo();
        Assert.assertEquals(firstTwo.firstTwo(str), expected);
    }

    @DataProvider (name = "firstTwoDataProvider")
    public Object[][] firstTwoDataProvider(){
        return new Object[][]{
                {"Hello", "He"},
                {"abcdefg", "ab"},
                {"ab", "ab"},
                {"a", "a"},
                {"", ""},
                {"Kitten", "Ki"},
                {"hi", "hi"},
                {"hiya", "hi"}
        };
    }

}
