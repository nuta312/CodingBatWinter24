package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.Right2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Right2Test {

    Right2 right2 = new Right2();

    @DataProvider(name = "getRight2")
    public Object[][] getRight2() {
        return new Object[][]{
                {"Hello", "loHel"},
                {"java", "vaja"},
                {"Hi", "Hi"}
        };
    }

    @Test(dataProvider = "getRight2")
    public void testRight2(String str, String expected){
        assertEquals(right2.right2(str), expected);
    }
}