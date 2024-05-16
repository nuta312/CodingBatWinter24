package janar.string_1_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NonStartTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"Hello", "Python", "elloython"},
                {"Java", "Script", "avacript"},
                {"Test", "NG", "estG"},
                // Добавьте другие тестовые данные, если нужно
        };
    }

    @Test(dataProvider = "testData")
    public void testConcatWithoutFirstChar(String a, String b, String expected) {
        String result = concatWithoutFirstChar(a, b);
        assertEquals(result, expected);
    }

    public String concatWithoutFirstChar(String a, String b) {
        if (a.length() < 1 || b.length() < 1) {
            throw new IllegalArgumentException("Strings must be at least length 1.");
        }
        return a.substring(1) + b.substring(1);
    }

}
