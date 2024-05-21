package jyldyzbek.string1_test;


import com.digital_nomads.jyldyzbek.string1.Right2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Right2Test {
    Right2 right2 = new Right2();

    @Test(dataProvider = "right2")
    public void testRight2(String str, String expected) {

        Assert.assertEquals(right2.right2(str), expected);
    }

    @DataProvider
    public Object[][] right2() {
        return new Object[][]{
                {"Hello", "loHel"},
                {"java", "vaja"},
                {"Hi", "Hi"},
                {"code", "deco"},
                {"cat", "atc"},
                {"12345", "45123"},
        };
    }
}
