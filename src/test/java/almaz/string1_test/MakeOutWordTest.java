package almaz.string1_test;

import com.digital_nomads.almaz.string1.MakeOutWord;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {
    @Test(dataProvider = "MakeOutWordTest")
    public void testMakeOutWord(String out, String word) {
        MakeOutWord makeOutWord = new MakeOutWord();
    }

    @DataProvider
    public Object[][] MakeOutWordTest() {
        return new Object[][]{
                {"abyz", "YAY"},
                {"HHoo", "Hello"},
                {"[[]]", "word"},
                {"<<>>", "WooHoo"},
                {"<<>>", "Yay"},
        };
    }
}
