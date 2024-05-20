package shirin.String1.String1_Test;

import com.digital_nomads.shirin.string1.Without2;
import com.digital_nomads.shirin.string1.WithoutX2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutX2_Test {

    @Test(dataProvider = "withoutX2")
    public void testWithoutX2(String str , String except){
        WithoutX2 ss = new WithoutX2();
        String s = ss.withoutX2(str);
        Assert.assertEquals(s,except);
    }

@DataProvider
    public Object [][] withoutX2(){
        return new Object[][]{
                {"xHi" ,"Hi"},
                {"Hxi" ,"Hi"},
                {"Hi" ,"Hi"},
                {"xxHi" ,"Hi"},
                {"Hix" , "Hix"},
                {"xaxb" , "axb"},
                {"xx" ,""},
                {"x" , ""},
                {"" , ""},
                {"Hello" , "Hello"},
                {"Hexllo" , "Hexllo"},
                {"xHxllo" , "Hxllo"}
        };
    }
}
