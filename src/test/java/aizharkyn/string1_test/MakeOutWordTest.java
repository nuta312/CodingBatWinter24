package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {

    @Test(dataProvider = "makeOutProvider")
    public void testMakeOut(String out, String word, String expected){
        Assert.assertEquals(MakeOutWord.makeOutWord(out, word), expected);
    }
    @DataProvider
    public Object [][] makeOutProvider(){
        return new Object[][]{
                {"<<>>", "Yay","<<Yay>>" },
                {"<<>>", "WooHoo", 	"<<WooHoo>>"},
                {"[[]]", "word","[[word]]"},
                {"HHoo", "Hello","HHHellooo"},
        };
    }
}
