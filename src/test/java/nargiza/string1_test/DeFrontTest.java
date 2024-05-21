package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.DeFront;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DeFrontTest {

DeFront deFront = new DeFront();

@DataProvider(name = "word")
public Object[][] getDeFront(){
    return new Object[][]{
            {"Hello", "llo"},
            {"java", "va"},
            {"away", "aay"}
    };
}

@Test(dataProvider = "word")
    public void testDeFront(String str, String expected){
    assertEquals(deFront.deFront(str), expected);
}
}