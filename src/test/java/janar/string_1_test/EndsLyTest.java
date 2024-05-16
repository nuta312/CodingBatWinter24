package janar.string_1_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EndsLyTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"happily", true},
                {"quickly", true},
                {"incredibly", true},
                {"sad", false},
                {"lovely", false},
                {"sleepily", true},
                {"", false},
                // Добавьте другие тестовые данные, если нужно
        };
    }

    @Test(dataProvider = "testData")
    public void testEndsInLy(String input, boolean expected) {
        boolean result = endsInLy(input);
        assertEquals(result, expected);
    }

    public boolean endsInLy(String str) {
        return str.endsWith("ly");
    }

}
