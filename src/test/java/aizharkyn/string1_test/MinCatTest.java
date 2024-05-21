package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.LastChars;
import com.digital_nomads.aizharkyn.string1.Mincat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinCatTest {

    @Test(dataProvider = "minCatProvider")
    public void testMinCat(String a, String b,  String expected){
        Assert.assertEquals(Mincat.minCat(a,b), expected);
    }

    @DataProvider
    public Object[][] minCatProvider(){
        return new Object[][]{
                {"Hello", "Hi","loHi"},
                {"Hello", "java","ellojava"	},
                {"abc", "x", "cx"},
                {"x", "abc",	"xc"},
        };
    }

}
