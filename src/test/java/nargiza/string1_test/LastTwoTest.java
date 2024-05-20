package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.LastTwo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LastTwoTest {

LastTwo lastTwo = new LastTwo();

@DataProvider(name = "word")
    public Object[][] getLastTwo(){
            return new Object[][]{
                    {"coding", "codign"},
                    {"cat", "cta"},
                    {"ab", "ba"}
            };
    }

    @Test(dataProvider = "word")
    public void testLastTwo(String str, String expected){
    assertEquals(lastTwo.lastTwo(str), expected);
    }
}