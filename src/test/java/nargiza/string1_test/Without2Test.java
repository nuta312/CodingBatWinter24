package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.Without2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Without2Test {

Without2 without2 = new Without2();

@DataProvider(name = "word")
public Object[][] getWithout2(){
    return new Object[][]{
            {"HelloHe",  "lloHe"},
            {"HelloHi", "HelloHi"},
            {"Hi", ""}
    };
}

@Test(dataProvider = "word")
    public void testWithout2(String str, String expected){
    assertEquals(without2.without2(str), expected);

}
}