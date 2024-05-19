package shirin.String1.String1_Test;

import com.digital_nomads.shirin.string1.Without2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Without2_Test {

    @Test(dataProvider = "Without2")
    public void testWithout2(String str , String except){
        Without2 u = new Without2();
        String s = u.without2(str);
        Assert.assertEquals(s , except);
    }

    @DataProvider
    public Object[][] Without2(){
        return  new Object[][] {
                {"HelloHe" ,"lloHe"},
                {"HelloHi" , "HelloHi"},
                {"Hi" ,""},
                {"Chocolate" ,"Chocolate"},
                {"xxx" , "x"},
                {"xx" ,""},
                {"x", "x"},
                {"" , ""},
                {"Fruits","Fruits"}
        };
    }
}
