package shirin.String1.String1_Test;

import com.digital_nomads.shirin.string1.MinCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MinCat_Test {

    @Test(dataProvider = "MinCat")
    public void testMinCat(String a , String b , String except ){
        MinCat cat = new MinCat();
        String str = cat.minCat(a,b);
        Assert.assertEquals(str,except);
    }

@DataProvider
    public Object[][] MinCat(){
        return new Object[][]{
                {"Hello", "Hi" ,"loHi"},
                {"Hello", "java" ,"ellojava"},
                {"java", "Hello" ,"javaello"},
                {"abc", "x" ,"cx"},
                {"x", "abc" , "xc"},
                {"abc", "" , ""}
        };
    }
}
