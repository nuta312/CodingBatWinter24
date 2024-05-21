package akylai.string1_test;

import com.digital_nomads.akylai.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {

    MakeOutWord makeWord = new MakeOutWord();

    @Test(dataProvider = "testMakeOutWord")
    public void makeOutWordTest(String out, String word) {
       System.out.println(out.substring(0,2)+word+out.substring(2));
        Assert.assertEquals(makeWord.makeOutWord(out, word),out.substring(0,2)+word+out.substring(2));
    }

    @DataProvider
    public String[][] testMakeOutWord(){
        return new String[][]{
                {"<<>>", "Yay"},
                {"<<>>", "WooHoo"},
                {"[[]]", "word"},
                {"HHoo", "Hello"},
                {"abyz", "YAY"}
        };
    }
}
