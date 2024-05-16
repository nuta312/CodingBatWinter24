package demo.String1_Test;

import com.digital_nomads.shirin.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NonStartTest {

    @Test(dataProvider = "NonStart")
    public void TestNonStartT(String a , String  b , String except ){
        NonStart non = new NonStart();
        String g = non.nonStart(a, b);
        Assert.assertEquals(g,except);
    }


    @DataProvider
    public Object[][] NonStart (){
        return  new Object[][] {
                {"Hello", "There" , "ellohere"},
                {"java", "code","avaode"},
                {"shotl", "java","hotlava"},
                {"ab", "xy" , "by"},
                {"ab", "x" , "b"},
                {"x", "ac" ,"c"}
        };
    }
}
