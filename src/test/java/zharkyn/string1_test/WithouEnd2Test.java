package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.WithouEnd2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithouEnd2Test {

    @Test (dataProvider = "withoutEnd2DataProvider")
    public void withouEnd2Test(String str, String expected){
        WithouEnd2 withouEnd2 = new WithouEnd2();
        Assert.assertEquals(withouEnd2.withouEnd2(str), expected);
    }

    @DataProvider(name = "withoutEnd2DataProvider")
    public Object[][] withoutEnd2DataProvider(){
        return new Object[][] {
                {"Hello","ell"},
                {"abc","b"},
                {"ab",""},
                {"a",""},
                {"",""},
                {"coldy","old"},
                {"java code","ava cod"}
        };

    }

}
