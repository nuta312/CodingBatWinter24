package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.MiddleTwo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MiddleTwoTest {

    MiddleTwo middleTwo = new MiddleTwo();

    @DataProvider(name = "getMiddleTwoTest")
    public Object[][] getMiddleTwoTest(){
        return new Object[][]{
                {"string", "ri"},
                {"code", "od"},
                {"Practice", "ct"}
        };
    }

    @Test(dataProvider = "getMiddleTwoTest")
    public void testMiddleTwoTest(String str, String expected){
        assertEquals(middleTwo.middleTwo(str), expected);
    }
}