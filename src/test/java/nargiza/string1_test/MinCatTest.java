package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.MinCat;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MinCatTest {

MinCat minCat = new MinCat();

@DataProvider(name = "word")
public Object[][] getMinCat(){
    return new Object[][]{
            {"Hello", "Hi", "loHi"},
            {"Hello", "java", "ellojava"},
            {"java", "Hello", "javaello"}
    };
}

@Test(dataProvider = "word")
    public void testMinCat(String a, String b, String expected){
    String result = minCat.minCat(a, b);
    assertEquals(result, expected);
}
}