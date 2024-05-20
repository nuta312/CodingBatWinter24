package demo.String1_Test;

import com.digital_nomads.shirin.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {
    @Test(dataProvider = "Extra")
    public  void  TestExtra(String str ){
        ExtraEnd end = new ExtraEnd();
      String a = end.extraEnd(str);
        Assert.assertEquals(a , str);
    }
@DataProvider
    public Object [][] Extra(){
        return  new  Object[][] {
                {"Hello", "lololo"},
                {"ab" , "ababab"},
                {"Hi", "HiHiHi"},
                {"Candy" ,"dydydy" },
                {"Code" ,"dedede" },

        };
    }
}
