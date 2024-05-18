package aizharkyn.string1_test;


import com.digital_nomads.aizharkyn.string1.DeFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeFrontTest {

    @Test(dataProvider = "deFrontProvider")
    public void testDeFront(String str,  String expected){
        Assert.assertEquals(DeFront.deFront(str), expected);
    }

    @DataProvider
    public Object[][] deFrontProvider(){
        return new Object[][]{
                {"Hello", "llo"	},
                {"java", "va"},
                {"away",  "aay"},
                {"axy", "ay"},
                {"aaa", "aa"},
                {"xz", ""},
                {"his", "s"},

        };
    }
}
