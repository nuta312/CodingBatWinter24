package Gaukhar.String1;

import com.digital_nomads.gaukhar.string1.makeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class makeOutWordTest {
    @Test
            (dataProvider = "testmake")
    public void testMakeOut (String out, String word, String e){
        makeOutWord mow = new makeOutWord();
        String str = mow.makeOutWord(out,word);
        Assert.assertEquals(str, e);
    }
    @DataProvider
    public Object [][] testmake(){
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo","<<WooHoo>>"},
                {"[[]]", "word","[[word]]"},
                {"HHoo", "Hello", "HHHellooo"},
                {"abyz", "YAY","abYAYyz"},

        };
    }
}
