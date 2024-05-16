package janar.string_1_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TheEndTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"Hello", true, "H"},
                {"Hello", false, "o"},
                {"Java", true, "J"},
                {"Java", false, "a"},
                {"TestNG", true, "T"},
                {"TestNG", false, "G"},

        };
    }

    @Test(dataProvider = "testData")
    public void testFrontOrBack(String input, boolean front, String expected) {
        String result = frontOrBack(input, front);
        assertEquals(result, expected);
    }

    public String frontOrBack(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }
}
