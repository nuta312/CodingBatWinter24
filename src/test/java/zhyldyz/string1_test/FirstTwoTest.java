package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.FirstTwo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FirstTwoTest {

    @Test(dataProvider = "firstTwoDataProvider")
    public void firstTwoTest(String str, String expected) {

        var firstTwo = new FirstTwo();
        assertEquals(firstTwo.firstTwo(str), expected);
    }

    @DataProvider(name = "firstTwoDataProvider")
    public String[][] firstTwoDataProvider() {
        return new String[][]{
                {"Hello", "He"},
                {"abcdefg", "ab"},
                {"ab", "ab"},
                {"a", "a"},
                {"", ""},
                {"Kitten", "Ki"},
                {"hiya", "hi"}
        };
    }

}