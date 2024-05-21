package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.EndsLy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EndsLyTest {

EndsLy endsLy = new EndsLy();

@DataProvider(name = "getEndsLy")
public Object[][] getEndsLy(){
    return new Object[][]{
            {"oddly", true},
            {"y", false},
            {"oddy", false}
    };
}

@Test(dataProvider = "getEndsLy")
    public void testEndsLy(String str, boolean expected){
    assertEquals(endsLy.endsLy(str), expected);
}
}