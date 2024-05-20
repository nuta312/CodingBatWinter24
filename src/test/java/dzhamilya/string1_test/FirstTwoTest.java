package dzhamilya.string1_test;

import com.digital_nomads.dzhamilya.string1.ExtraEnd;
import com.digital_nomads.dzhamilya.string1.FirstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTwoTest {

    @Test(dataProvider = "TwoTest")
    public void firstTest(String str, String expected) {
        FirstTwo first = new FirstTwo();
        Assert.assertEquals(first.firstTwo(str),expected);


    }
    @DataProvider
    public Object[][] TwoTest() {
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
