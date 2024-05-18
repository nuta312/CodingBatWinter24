package aizharkyn.string1_test;


import com.digital_nomads.aizharkyn.string1.WithoutX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutxTest {

    @Test(dataProvider = "withoutXProvider")
    public void testWithoutX(String str, String expected){
        Assert.assertEquals(WithoutX.withoutX(str), expected);
    }

    @DataProvider
    public Object[][] withoutXProvider(){
        return new Object[][]{
                {"xHix", "Hi"},
                {"xHi", "Hi"},
                {"Hxix", "Hxi"},
                {"xaxbx", "axb"},
                {"Hexllo", "Hexllo"},
        };
    }

}
