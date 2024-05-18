package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.WithoutX;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WithoutXTest {

    @Test(dataProvider = "withoutXDataProvider")
    public void withoutXTest(String str, String expected){
        WithoutX withoutX = new WithoutX();
        assertEquals(withoutX.withoutX(str), expected);
    }

    @DataProvider(name = "withoutXDataProvider")
    public Object[][] withoutXDataProvider(){
        return new Object[][] {
                {"xHix","Hi"},
                {"xHi","Hi"},
                {"Hxix","Hxi"},
                {"Hi","Hi"},
                {"xxHi","xHi"},
                {"Hix","Hi"},
                {"xaxbx","axb"},
                {"xx",""}
        };
    }
}
