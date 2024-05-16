package janar.string_1_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WithoutEndTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"Hello", "ell"},
                {"Java", "av"},
                {"Testing", "estin"},
                // Добавьте другие тестовые данные, если нужно
        };
    }

    @Test(dataProvider = "testData")
    public void testWithoutEnd(String input, String expected) {
        String result = withoutEnd(input);
        assertEquals(result, expected);
    }

    public String withoutEnd(String str) {
        if (str.length() < 2) {
            throw new IllegalArgumentException("String length must be at least 2.");
        }
        return str.substring(1, str.length() - 1);
    }

}
