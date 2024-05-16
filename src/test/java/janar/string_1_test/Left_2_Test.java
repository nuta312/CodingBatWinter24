package janar.string_1_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Left_2_Test {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"Hello", "lloHe"},
                {"Java", "vaJa"},
                {"TestNG", "stNGTe"},
                {"AB", "BA"},

        };
    }

    @Test(dataProvider = "testData")
    public void testRotateLeft2(String input, String expected) {
        String result = rotateLeft2(input);
        assertEquals(result, expected);
    }

    public String rotateLeft2(String str) {
        if (str.length() < 2) {
            throw new IllegalArgumentException("String length must be at least 2.");
        }
        return str.substring(2) + str.substring(0, 2);
    }

}
