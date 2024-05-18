package aijan.string1_test;

import com.digital_nomads.aijan.string1.FirstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTwoTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][] {
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

    @Test(dataProvider = "word")
    public void TestRirstTwo(String str, String expectedResult) {
        FirstTwo obj = new FirstTwo();
        String actualResult = obj.firstTwo(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
