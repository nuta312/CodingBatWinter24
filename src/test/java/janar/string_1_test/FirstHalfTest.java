package janar.string_1_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FirstHalfTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"WooHoo", "Woo"},
                {"HelloWorld", "Hello"},
                {"TestNG", "Test"},
                // Добавьте другие тестовые данные, если нужно
        };
    }

    @Test(dataProvider = "testData")
    public void testFirstHalf(String input, String expected) {
        String result = firstHalf(input);
        assertEquals(result, expected);
    }

    public String firstHalf(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("String length must be even.");
        }
        int halfLength = str.length() / 2;
        return str.substring(0, halfLength);
    }

}
