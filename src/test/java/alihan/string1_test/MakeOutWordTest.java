package alihan.string1_test;

import com.digital_nomads.alihan.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest{
    @Test(dataProvider = "makeOutWord")
    public void testMakeOutWord(String out, String word , String expected){
        MakeOutWord makeOutWord = new MakeOutWord();
        String result = makeOutWord.makeOutWord(out,word);
        Assert.assertEquals(result,expected);
    }



 @DataProvider
    public Object [][] makeOutWord(){
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},
                {"HHoo", "Hello", "HHHellooo"},
                {"abyz", "YAY", "abYAYyz"},
        };
    }
}
