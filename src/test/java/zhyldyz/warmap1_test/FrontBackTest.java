package zhyldyz.warmap1_test;

import com.digital_nomads.zhyldyz.warmap1.FrontBack;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrontBackTest {

    FrontBack frontBack = new FrontBack();

    @DataProvider(name = "frontBackDataProvider")
    public String [][] frontBackDataProvider(){

        return new String[][]{

                {"code", "eodc"},
                {"aavJ", "Java"},
                {"Chocolate", "ehocolatC"},
                {"abc", "cba"},
                {"ab", "ba"},
                {"a", "a"},
                {"hello", "oellh"}
        };
    }

    @Test(dataProvider = "frontBackDataProvider")
   void frontBackTest(String str, String expected){

        assertEquals(frontBack.frontBack(str), expected);
    }

}