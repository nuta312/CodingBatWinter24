package almaz.string1_test;

import com.digital_nomads.almaz.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {
    @Test(dataProvider = "MakeOutWordTest")
    public void testMakeOutWord(String out, String word, String expect) {
        MakeOutWord makeOutWord = new MakeOutWord();
        String result = makeOutWord.makeOutWord(out,word);
        Assert.assertEquals(result,expect);
    }

    @DataProvider
    public Object[][] MakeOutWordTest() {
        return new Object[][]{
                {"abyz", "YAY", "abYAYyz"},
                {"HHoo", "Hello", "HHHellooo"},
                {"[[]]", "word", "[[word]]"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"<<>>", "Yay", "<<Yay>>"},
        };
    }
}
