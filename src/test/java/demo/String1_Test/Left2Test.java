package demo.String1_Test;

import com.digital_nomads.shirin.string1.Left2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Left2Test {

    @Test(dataProvider = "Left2")
    public void TestLeft(String str , String except){
        Left2 left = new Left2();
        String a = left.left2(str);
        Assert.assertEquals(a,except);
    }

    @DataProvider
    public Object [][] Left2(){
        return new Object[][]{
                {"Hello" ,"lloHe" },
                {"java" , "vaja"},
                {"Hi" ,"Hi"},
                {"code" ,"deco"},
                {"cat" , "tca"},
                {"12345" ,"34512"}
        };
    }
}
