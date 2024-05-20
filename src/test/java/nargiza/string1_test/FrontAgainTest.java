package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.FrontAgain;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrontAgainTest {

FrontAgain frontAgain = new FrontAgain();

    @DataProvider(name = "word")
    public Object[][] getFrontAgain(){
    return new Object[][]{
            {"edited", true},
            {"edit", false},
            {"ed", true}
    };
}

@Test(dataProvider = "word")
    public void testFrontAgain(String str, boolean expected){
        assertEquals(frontAgain.frontAgain(str),expected);
}

}