package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.MakeAbba;
import com.digital_nomads.zafura.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {
    @Test(dataProvider = "Word")
    public void makeOutWordTest(String out,String word,String expected){
        MakeOutWord makeOutWord = new MakeOutWord();
        Assert.assertEquals(makeOutWord.makeOutWord(out,word),expected);
    }
    @DataProvider
    public Object[][]Word(){
        return new Object[][]{
                {"<<>>", "Yay","<<Yay>>"},
                {"<<>>", "WooHoo","<<WooHoo>>" },
                {"[[]]", "word","[[word]]"},
                {"HHoo", "Hello","HHHellooo"},
                {"abyz", "YAY","abYAYyz"},

        };
}}
