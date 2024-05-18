package aizharkyn.string1_test;


import com.digital_nomads.aizharkyn.string1.WithoutX2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutX2Test {
    @Test(dataProvider = "withoutX2Provider")
    public void testWithoutX2(String str, String expected){
        Assert.assertEquals(WithoutX2.withoutX2(str), expected);
    }

    @DataProvider
    public Object[][] withoutX2Provider(){
        return new Object[][]{
                {"xHi", "Hi"},
                {"Hix", "Hi"},
                {"xaxb", "axb"},
                {"xx", ""},
                {"Hello", "Hello"},
        };
    }



}
