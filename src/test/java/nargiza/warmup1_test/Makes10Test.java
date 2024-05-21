package nargiza.warmup1_test;

import com.digital_nomads.nargiza.warmup1.Makes10;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Makes10Test {

Makes10 makes10 = new Makes10();

@DataProvider(name = "word")
    public Object[][] getMakes10() {
    return new Object[][]{
            {9, 10, true},
            {9, 9, false},
            {1, 9, true}
    };
}

@Test(dataProvider = "word")
    public void testMakes10(int a, int b, boolean expected){
        assertEquals(makes10.makes10(a, b), expected);
    }
}