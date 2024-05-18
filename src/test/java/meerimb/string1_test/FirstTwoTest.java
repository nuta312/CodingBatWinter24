package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.FirstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTwoTest {
    FirstTwo firstTwo = new FirstTwo();

    @Test(dataProvider = "firstTwo")
    public void testFirstTwo(String str, String expected) {

        Assert.assertEquals(firstTwo.firstTwo(str), expected);
    }

    @DataProvider(name = "firstTwo")
    public Object[][] firstTwo() {
        return new Object[][]{
                {"Hello", "He"},
                {"abcdefg", "ab"},
                {"ab", "ab"},
                {"a", "a"},
                {"", ""},
                {"Kitten", "Ki"},
                {"hi", "hi"},
                {"hiya", "hi"},
        };
    }
}
