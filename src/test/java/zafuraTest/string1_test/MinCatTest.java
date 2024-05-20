package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.MinCat;
import com.digital_nomads.zafura.string1.SeeColor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinCatTest {
    @Test(dataProvider = "mincat")
    public void testMinCat(String a,String b,  String expected) {
        MinCat minCat = new MinCat();
        Assert.assertEquals(minCat.minCat(a,b), expected);
    }

    @DataProvider
    public Object[][] mincat() {

        return new Object[][]{
                {"Hello", "Hi", "loHi"},
                {"Hello", "java", "ellojava"},
                {"abc", "",""},
        };
    }
}

