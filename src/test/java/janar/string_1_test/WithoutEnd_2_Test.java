package janar.string_1_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WithoutEnd_2_Test {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"Hello", "ell"},
                {"Java", "av"},
                {"TestNG", "estN"},
                {"ABCD", "BC"},
                {"A", ""},
                {"", ""},
                // Добавьте другие тестовые данные, если нужно
        };
    }

    @Test(dataProvider = "testData")
    public void testWithoutFirstAndLastChar(String input, String expected) {
        String result = withoutFirstAndLastChar(input);
        assertEquals(result, expected);
    }

    public String withoutFirstAndLastChar(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

}
