package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.ConCat;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ConCatTest {

ConCat conCat = new ConCat();

@DataProvider(name = "word")
    public Object[][] getConCat(){
    return new Object[][]{
            {"abc", "cat", "abcat"},
            {"dog", "cat", "dogcat"},
            {"abc", "", "abc"}
    };
}

@Test(dataProvider = "word")
    public void testConCat(String a, String b, String expected){
    String result = conCat.conCat(a, b);
    assertEquals(result, expected);
}
}