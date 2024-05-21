package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.AtFirst;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AtFirstTest {

AtFirst atFirst = new AtFirst();

@DataProvider(name = "getAtFirst")
    public Object[][] getAtFirst(){
    return new Object[][]{
            {"hello", "he"},
            {"hi", "hi"},
            {"h", "h@"}
    };
}

@Test(dataProvider = "getAtFirst")
    public void testAtFirst(String str, String expected){
    assertEquals(atFirst.atFirst(str), expected);
}
}