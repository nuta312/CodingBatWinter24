package tais.string1_test;

import com.digital_nomads.tais.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {


    @Test(dataProvider = "dPMakeOutWordTest")
    public void makeOutWordTest(String out, String word, String expected) {

        MakeOutWord makeOW = new MakeOutWord();

        Assert.assertEquals(makeOW.makeOutWord(out, word), expected);
    }


    @DataProvider
    public Object[][] dPMakeOutWordTest() {
        return new Object[][]{
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo", "<<WooHoo>>"},
                {"[[]]", "word", "[[word]]"},
                {"HHoo", "Hello", "HHHellooo"},
                {"abyz", "YAY", "abYAYyz"}
        };
    }
}
