package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.WithoutEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WithoutEndTest {

    WithoutEnd withoutEnd = new WithoutEnd();

    @DataProvider(name = "getWithoutEnd")
    public Object[][] getWithoutEnd(){
        return new Object[][]{
                {"Hello", "ell"},
                {"java", "av"},
                {"coding", "odin"}
        };
    }

    @Test(dataProvider = "getWithoutEnd")
    public void testWithoutEnd(String str, String expected){
        assertEquals(withoutEnd.withoutEnd(str), expected);
    }

}