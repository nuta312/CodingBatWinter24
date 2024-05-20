package demo.String1_Test;

import com.digital_nomads.shirin.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEndTest {

    @Test(dataProvider = "withoutEnd")
    public void testWithoutEnd(String str , String except){
        WithoutEnd end = new WithoutEnd();
        String a = end.withoutEnd(str);
        Assert.assertEquals(a,except);
    }


    @DataProvider
    public Object[][] withoutEnd(){
        return new Object[][]{
                {"Hello" ,"ell"},
                {"java" ,"av"},
                {"coding" ,"odin"},
                {"code" ,"od"},
                {"ab" , ""}
        };
    }
}
