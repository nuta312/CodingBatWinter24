package janar.string_1_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MiddleTwoTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"string", "ri"},
                {"Java", "av"},
                {"Hello", "el"},
                {"ABCD", "BC"},
                {"12", "12"},
                // Добавьте другие тестовые данные, если нужно
        };
    }

    @Test(dataProvider = "testData")
    public void testMiddleTwoChars(String input, String expected) {
        String result = middleTwoChars(input);
        assertEquals(result, expected);
    }

    public String middleTwoChars(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }

}
