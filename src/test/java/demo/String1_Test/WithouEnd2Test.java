package demo.String1_Test;

import com.digital_nomads.shirin.string1.WithouEnd2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithouEnd2Test {

    @Test(dataProvider = "withouEnd")
    public void testWithouEnd(String str , String except){
        WithouEnd2 wen = new WithouEnd2();
        String a = wen.withouEnd2(str);
        Assert.assertEquals(a,except);
    }

@DataProvider
    public Object[][] withouEnd(){
        return  new Object[][]{
                {"Hello", "ell"},
                {"abc","b"},
                {"ab" ,""},
                {"a" ,""},
                {"" ,""},
                {"coldy","old"}
        };
    }
}
