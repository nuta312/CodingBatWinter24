package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.HasBad;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HasBadTest {

HasBad hasBad = new HasBad();

@DataProvider(name = "getHasBad")
    public Object[][] getHasBad(){
    return new Object[][]{
            {"badxx", true},
            {"xbadxx", true},
            {"xxbadxx", false}
    };
    }

    @Test(dataProvider = "getHasBad")
    public void testHasBad(String str, boolean expected){
    assertEquals(hasBad.hasBad(str), expected);
    }
}