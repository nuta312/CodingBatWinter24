package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.SeeColor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SeeColorTest {

    SeeColor seeColor = new SeeColor();

@DataProvider(name = "word")
    public Object[][] getSeeColor(){
    return new Object[][]{
            {"redxx", "red"},
            {"xxred", ""},
            {"blueTimes", "blue"}
    };
}

@Test(dataProvider = "word")
    public void testSeeColor(String str, String expected){
    assertEquals(seeColor.seeColor(str), expected);
}
}