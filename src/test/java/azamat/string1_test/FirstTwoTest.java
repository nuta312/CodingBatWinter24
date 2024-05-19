package azamat.string1_test;

import com.digital_nomads.azamat.string1.FirstTwo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FirstTwoTest {

    @Test(dataProvider = "firstTwoDataProvider")
    public void testFirstTwo(String input, String expected) {
        FirstTwo firstTwo = new FirstTwo();
        assertEquals(firstTwo.firstTwo(input), expected);
    }

    @DataProvider
    public Object[][] firstTwoDataProvider() {
        return new Object[][]{
                {"Hello", "He"},
                {"abcd", "ab"},
                {"High mount", "Hi"},
                {"", ""},
                {"x", "x"},
                {"1234567", "12"},
                {"xyz", "xy"}
        };
    }
}