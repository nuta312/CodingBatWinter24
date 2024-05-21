package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.ExtraFront;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExtraFrontTest {

ExtraFront extraFront = new ExtraFront();

@DataProvider(name = "word")
public Object[][] getExtraFront(){
    return new Object[][]{
            {"Hello", "HeHeHe"},
            {"ab", "ababab"},
            {"H", "HHH"}
    };
}

@Test(dataProvider = "word")
    public void testExtraFront(String str, String expected){
    assertEquals(extraFront.extraFront(str), expected);
}
}