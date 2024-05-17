package meka.string1_test;

import com.digital_nomads.meka.string1.FirstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTwoTest {

    @Test(dataProvider = "testData")
    public void testFirstTwo(String str, String expected){
        FirstTwo firstTwo = new FirstTwo();
        String result = firstTwo.firstTwo(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
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
