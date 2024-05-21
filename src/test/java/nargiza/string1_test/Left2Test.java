package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.Left2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Left2Test {

    Left2 left2 = new Left2();

    @DataProvider(name = "getLeft2")
    public Object[][] getLeft2(){
        return new Object[][]{
                {"Hello", "lloHe"},
                {"java", "vaja"},
                {"Hi", "Hi"}
        };
    }
@Test(dataProvider = "getLeft2")
    public void testLeft2(String str, String expected){
        assertEquals(left2.left2(str), expected);

}

}