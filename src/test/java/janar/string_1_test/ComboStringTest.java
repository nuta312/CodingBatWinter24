package janar.string_1_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ComboStringTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"Hello", "Hi", "HiHelloHi"},
                {"Java", "Python", "JavaPythonJava"},
                {"Testing", "Test", "TestTestingTest"},
                {"", "Empty", "EmptyEmptyEmpty"},

        };
    }

    @Test(dataProvider = "testData")
    public void testShortLongShort(String a, String b, String expected) {
        String result = shortLongShort(a, b);
        assertEquals(result, expected);
    }

    public String shortLongShort(String a, String b) {
        String shorter = (a.length() < b.length()) ? a : b;
        String longer = (a.length() < b.length()) ? b : a;
        return shorter + longer + shorter;
    }

}
