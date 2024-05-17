package eldorados_test.str1.test;

import com.digital_nomads.eldorado.str1.MakeOutWord;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _4MakeOutWord {
@Test(dataProvider = "MOWT")
public void testMakeOutWord(String a, String b, String e){
    MakeOutWord mow = new MakeOutWord();
    String res = mow.makeOutWords(a,b);
    assert res.equals(e);
}




@DataProvider
    public Object[][] MOWT(){
    return new Object[][]{
            {"<<>>","Yay","<<Yay>>"},
            {"<<>>","WooHoo","<<WooHoo>>"},
            {"[[]]","word","[[word]]"},
    };

    }

}
