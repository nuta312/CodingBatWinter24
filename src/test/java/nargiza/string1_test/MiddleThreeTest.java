package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.MiddleThree;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MiddleThreeTest {

MiddleThree middleThree = new MiddleThree();

@DataProvider(name = "getMiddleThree")
    public Object[][] getMiddleThree(){
    return new Object[][]{
            {"Candy", "and"},
            {"and", "and"},
            {"solving", "lvi"}
    };
}

@Test(dataProvider = "getMiddleThree")
    public void testMiddleThree(String str, String expected){
    assertEquals(middleThree.middleThree(str), expected);
}

}