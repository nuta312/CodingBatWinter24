package demo.String1_Test;

import com.digital_nomads.shirin.string1.MiddleTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleTwoTest {

    @Test(dataProvider = "MiddleTwo")
    public void TestMiddleTwo(String str , String except){
        MiddleTwo middle = new MiddleTwo();
        String s = middle.middleTwo(str);
        Assert.assertEquals(s , except);
    }

@DataProvider
    public Object [][] MiddleTwo(){
        return new Object[][]{
                {"string","ri"},
                {"code" , "od"},
                {"Practice","ct"},
                {"ab" , "ab"},
                {"0123456789" , "45"}

        };
    }
}
