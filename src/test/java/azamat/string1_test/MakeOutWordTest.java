package azamat.string1_test;

import com.digital_nomads.azamat.string1.MakeOutWord;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MakeOutWordTest {
    @Test(dataProvider = "makeOutWordDataProvider")
public void testMakeOutWord(String out, String word, String expected) {
    MakeOutWord makeOutWord = new MakeOutWord();
    assertEquals(makeOutWord.makeOutWord(out, word), expected);
}

    @DataProvider
    public Object[][] makeOutWordDataProvider() {
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"(())", "Hello", "((Hello))"},
                {"[[]]", "Wow", "[[Wow]]"},
                {"{{}}", "Java", "{{Java}}"},

        };
    }
}
