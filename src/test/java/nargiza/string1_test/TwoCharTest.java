package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.TwoChar;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TwoCharTest {

TwoChar twoChar = new TwoChar();

@DataProvider(name = "getTwoChar")
    public Object[][]getTwoChar(){
    return new Object[][]{
            {"java", 0, "ja"},
            {"java", 2, "va"},
            {"java", 3, "ja"}
    };
}

@Test(dataProvider = "getTwoChar")
    public void testTwoChar(String str, int index, String expected){
    String result = twoChar.twoChar(str, index);
    assertEquals(result, expected);
}
}