package nuraiym.string1_test;

import com.digital_nomads.almaz.string1.MakeOutWord;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class makeOutWordTest {

    @Test(dataProvider = "makeOutWordData")
    public void testMakeOutWord(String out, String word, String expected) {
        MakeOutWord makeOutWord = new MakeOutWord();
        String result = makeOutWord.makeOutWord(out, word);
        assertEquals(result, expected);
    }

    @DataProvider(name = "makeOutWordData")
    public Object[][] makeOutWordDataProvider() {
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},
                {"HHoo", "Hello", "HHHellooo"},
                {"abyz", "YAY", "abYAYyz"}
        };
    }
}
