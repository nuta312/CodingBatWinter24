package shirin.String1.String1_Test;

import com.digital_nomads.shirin.string1.WithoutX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutX_Test {

    @Test(dataProvider ="withoutX" )
    public void testWithoutX(String str , String except){
        WithoutX x = new WithoutX();
        String s = x.withoutX(str);
        Assert.assertEquals(s,except);
    }

    @DataProvider
    public Object[][] withoutX(){
        return  new Object[][]{
                {"xHix" , "Hi"},
                {"xHi"  , "Hi"},
                {"Hxix" , "Hxi"},
                {"Hi"   , "Hi"},
                {"xxHi" ,"xHi"},
                {"Hix" , "Hi"},
                {"xaxbx", "axb"},
                {"xx" ,""},
                {"x" ,""},
                {"x" , ""},
                {"Hello" , "Hello"},
                {"Hexllo" ,"Hexllo"}
        };
    }
}
