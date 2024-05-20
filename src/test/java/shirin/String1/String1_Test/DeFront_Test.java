package shirin.String1.String1_Test;

import com.digital_nomads.shirin.string1.DeFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeFront_Test {

    @Test(dataProvider = "deFront")
    public void testDeFront(String  str , String except){
        DeFront front = new DeFront();
        String s = front.deFront(str);
        Assert.assertEquals(s,except);
    }


    @DataProvider
    public Object[][] deFront(){
        return new Object[][]{
                {"Hello" ,"llo"},
                {"java" , "va"},
                {"away" , "aay"},
                {"axy", "ay"},
                {"abc" ,"abc"},
                {"xby" ,"by"},
                {"ab" , "ab"},
                {"ax" , "a"},
                {"axb" , "ab"},
                {"aaa" ,"aa"},
                {"aaa" ,"aa"},
                {"bbb" ,"bb"},
                {"hi" ,""}
        };
    }
}
