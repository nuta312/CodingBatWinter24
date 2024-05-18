package aynura.string1_test;

import com.digital_nomads.aida.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {

    @Test(dataProvider = "words")
    public void testMakeOutWord(String out, String word, String expectedResult){
        MakeOutWord makeOutWord = new MakeOutWord();
        Assert.assertEquals(makeOutWord.makeOutWord(out, word), expectedResult);
    }

    @DataProvider
    public Object [][] words(){
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},
                {"HHoo", "Hello", "HHHellooo"},
                {"abyz", "YAY", "abYAYyz"}
        };
    }
}
