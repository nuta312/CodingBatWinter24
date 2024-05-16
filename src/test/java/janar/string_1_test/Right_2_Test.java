package janar.string_1_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Right_2_Test {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"Hello", "loHel"},
                {"Java", "vaJa"},
                {"TestNG", "NGTest"},
                {"AB", "BA"},
                // Добавьте другие тестовые данные, если нужно
        };
    }

    @Test(dataProvider = "testData")
    public void testRotateRight2(String input, String expected) {
        String result = rotateRight2(input);
        assertEquals(result, expected);
    }

    public String rotateRight2(String str) {
        if (str.length() < 2) {
            throw new IllegalArgumentException("String length must be at least 2.");
        }
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

}
