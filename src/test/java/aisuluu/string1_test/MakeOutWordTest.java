package aisuluu.string1_test;

import digital_nomads.aisuluu.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {
    @Test (dataProvider = "makeoutword")
    public void testMakeOutWord (String out, String word, String exp){
        MakeOutWord makeoutword = new MakeOutWord();
        String result = makeoutword.makeOutWord(out, word);
        assert result.equals(exp);
    }
    @DataProvider
    public String[][] makeoutword(){
        return new String[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},
                {"HHoo", "Hello", "HHHellooo"},
                {"abyz", "YAY", "abYAYyz"},
        };
    }
}
