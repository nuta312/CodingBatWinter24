package shirin.String1.String1_Test;

import com.digital_nomads.shirin.string1.StartWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StartWord_Test {

    @Test(dataProvider ="startWord" )
    public void testStartWord(String str , String word , String except){
        StartWord wor = new StartWord();
        String s =wor.startWord(str,word);
        Assert.assertEquals(s,except);
    }

    @DataProvider
    public Object[][] startWord(){
        return new Object[][]{
                {"hippo", "hi" ,"hi"},
                {"hippo", "xip" , "hip"},
                {"hippo", "i" ,"h"},
                {"hippo", "ix", ""},
                {"h", "ix" ,""},
                {"", "i" , ""},
                {"hip", "zi" , "hi"},
                {"hip", "zip" ,"hip"},
                {"hip", "zig" , ""},
                {"h", "z" ,"h"},
                {"hippo", "xippo" , "hippo"},
                {"hippo", "xyz" ,""},
                {"hippo", "hip" ,"hip"},
                {"kitten", "cit" ,"kit"},
                {"kit", "cit" , "kit"}
        };
    }
}
