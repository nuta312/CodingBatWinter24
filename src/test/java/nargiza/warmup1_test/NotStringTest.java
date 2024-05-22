package nargiza.warmup1_test;

import com.digital_nomads.nargiza.warmup1.NotString;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NotStringTest {

NotString notString = new NotString();

@DataProvider(name = "getNotString")
    public Object[][] getNotString(){
    return new Object[][]{
            {"candy", "not candy"},
            {"x", "not x"},
            {"not bad", "not bad"}
    };
}

@Test(dataProvider = "getNotString")
    public void testNotString(String str, String expected){
assertEquals(notString.notString(str), expected);
}
}