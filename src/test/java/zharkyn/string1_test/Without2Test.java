package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.Without2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Without2Test {

    @Test(dataProvider = "without2DataProvider")
    public void without2Test(String str, String expected){
        Without2 without2 = new Without2();
        Assert.assertEquals(without2.without2(str), expected);
    }

    @DataProvider(name = "without2DataProvider")
    public Object[][] without2DataProvider(){
        return new Object[][] {
                {"HelloHe","lloHe"},
                {"HelloHi","HelloHi"},
                {"Hi",""},
                {"Chocolate","Chocolate"},
                {"xxx","x"},
                {"xx",""},
                {"x","x"},
                {"",""},
                {"Fruits","Fruits"}
        };
    }
}
