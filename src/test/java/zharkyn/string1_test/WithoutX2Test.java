package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.WithoutX;
import com.digital_nomads.zharkyn.string1.WithoutX2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WithoutX2Test {

    @Test(dataProvider = "withoutX2DataProvider")
    public void withoutX2Test(String str, String expected){
        WithoutX2 withoutX = new WithoutX2();
        assertEquals(withoutX.withoutX2(str), expected);
    }

    @DataProvider(name = "withoutX2DataProvider")
    public Object[][] withoutX2DataProvider(){
        return new Object[][] {
                {"xHi","Hi"},
                {"Hxi","Hi"},
                {"Hi","Hi"},
                {"xxHi","Hi"},
                {"Hix","Hix"},
                {"xx",""},
                {"x",""},
                {"Hexllo","Hexllo"}
        };
    }
}
