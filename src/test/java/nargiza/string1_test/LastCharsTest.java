package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.LastChars;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LastCharsTest {

LastChars lastChars = new LastChars();

@DataProvider(name = "word")
    public Object[][] getLastChars(){
    return new Object[][]{
            {"last", "chars", "ls"},
            {"yo", "java", "ya"},
            {"hi", "", "h@"}
    };
}

@Test(dataProvider = "word")
    public void testLastChars(String a, String b, String expected){
    String result = lastChars.lastChars(a, b);
    assertEquals(result, expected);
}
}