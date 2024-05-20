package demo.String1_Test;

import com.digital_nomads.shirin.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeOutWordTest {

    @Test(dataProvider = "MakeOut")
    public void TestMakeOut(String out , String word , String except){
        MakeOutWord make = new MakeOutWord();

        String str = make.makeOutWord(out,word);
        Assert.assertEquals(str,except);
    }

@DataProvider
    public Object[][]  MakeOut(){
        return  new Object[][] {
                {"<<>>", "Yay", "<<Yay>>"},
                {"<<>>", "WooHoo" , "<<WooHoo>>"},
                {"[[]]", "word" ,"[[word]]"},
                {"HHoo", "Hello" , "HHHellooo"},
                {"abyz", "YAY" , "abYAYyz"}
        };
    }
}
