package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.StartWord;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StartWordTest {

StartWord startWord = new StartWord();

@DataProvider(name = "word")
    public Object[][] getStartWord(){
    return new Object[][]{
            {"hippo", "hi", "hi"},
            {"hippo", "xip", "hip"},
            {"hippo", "i", "h"}
    };
}

@Test(dataProvider = "word")
    public void testStartWord(String str, String word, String expected){
    String result = startWord.startWord(str, word);
    assertEquals(result, expected);
}
}