package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.MinCat;
import com.digital_nomads.zharkyn.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinCatTest {

    @Test(dataProvider = "minCatDataProvider")
    public void   minCatTest(String a, String b, String str){
        MinCat minCat = new MinCat();
        Assert.assertEquals(minCat.minCat(a,b), str);
    }

    @DataProvider(name = "minCatDataProvider")
    public Object[][]   minCatDataProvider(){
        return new Object[][] {
                {"Hello", "Hi", "loHi"},
                {"Hello", "java", "ellojava"},
                {"java", "Hello", "javaello"},
                {"abc", "x", "cx"},
                {"x", "abc", "xc"},
                {"abc", "", ""}
        };
    }
}
