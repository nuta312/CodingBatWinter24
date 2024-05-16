package demo.String1_Test;

import com.digital_nomads.shirin.string1.TheEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TheEndTest {


    @Test(dataProvider ="TheEnd" )
    public void testTheEnd(String str , boolean front ,String except ){
        TheEnd  rnd = new TheEnd();
        String b = rnd.theEnd(str,front);
        Assert.assertEquals(b,except);
    }

    @DataProvider
    public Object [][] TheEnd(){
        return new Object[][]{
                {"Hello", true , "H"},
                {"Hello", false ,"o"},
                {"oh", true ,"o"},
                {"oh", false ,"h"},
                {"x", true ,"x"}
        };
    }
}
