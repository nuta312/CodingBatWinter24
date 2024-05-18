package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.WithoutX2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WithoutX2Test {

    WithoutX2 withoutX2 = new WithoutX2();

    @Test(dataProvider = "withoutX2DataProvider")
    void withoutX2Test(String str, String exception){

        assertEquals(withoutX2.withoutX2(str), exception);
    }

    @DataProvider(name = "withoutX2DataProvider")
    public String[][] withoutX2DataProvider(){

        return new String[][]{

                {"xxHi", "Hi"},
                {"Hix", "Hix"},
                {"xaxb", "axb"},
                {"xx", ""},
                {"x", ""},
                {"", ""},
                {"Hello", "Hello"},
                {"Hexllo", "Hexllo"},
                {"xHxllo", "Hxllo"}
        };
    }
}