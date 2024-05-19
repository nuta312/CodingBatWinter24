package jyldyzbek.string1_test;

import com.digital_nomads.jyldyzbek.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {

    @Test(dataProvider = "makeOutWord")
        public void makeOutWordTest(String str, String str1, String str2) {
        MakeOutWord makeOutWord = new MakeOutWord();
        String result = makeOutWord.makeOutWord(str, str1);
        Assert.assertEquals(result, str2);
    }

    @DataProvider
    public Object[][]makeOutWord(){
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"	},
                {"HHoo", "Hello", "HHHellooo"},
                {"abyz", "YAY", "abYAYyz"}
        };
    }

}
