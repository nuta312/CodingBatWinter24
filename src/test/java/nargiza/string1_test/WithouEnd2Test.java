package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.WithouEnd2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WithouEnd2Test {

WithouEnd2 withouEnd2 = new WithouEnd2();

@DataProvider(name = "getWithouEnd2")
public Object[][] getWithouEnd2(){
    return new Object[][]{
            {"Hello", "ell"},
            {"abc", "b"},
            {"ab", ""}
    };
}

@Test(dataProvider = "getWithouEnd2")
public void testWithouEnd2(String str, String expected){
assertEquals(withouEnd2.withouEnd2(str), expected);
}

}