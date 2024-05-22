package nargiza.warmup1_test;

import com.digital_nomads.nargiza.warmup1.FrontBack;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrontBackTest {

    FrontBack frontBack = new FrontBack();

    @DataProvider(name = "getFrontBack")
    public Object[][] getFrontBack() {
        return new Object[][]{
                {"code", "eodc"},
                {"a", "a"},
                {"ab", "ba"}
        };
    }

    @Test(dataProvider = "getFrontBack")
    public void testFrontBack(String str, String expected) {
        assertEquals(frontBack.frontBack(str), expected);
    }
}