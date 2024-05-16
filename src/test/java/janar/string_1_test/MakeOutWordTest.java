package janar.string_1_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MakeOutWordTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},

        };
    }

    @Test(dataProvider = "testData")
    public void testMakeOutWord(String out, String word, String expected) {
        String result = makeOutWord(out, word);
        assertEquals(result, expected);
    }

    public String makeOutWord(String out, String word) {
        int mid = out.length() / 2;
        String firstPart = out.substring(0, mid);
        String secondPart = out.substring(mid);
        return firstPart + word + secondPart;
    }

}

