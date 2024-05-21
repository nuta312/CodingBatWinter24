package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.Without2;
import com.digital_nomads.nargiza.string1.WithoutX2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WithoutX2Test {

WithoutX2 withoutx2 = new WithoutX2();

@DataProvider(name = "word")
public Object[][] getWithoutX2(){
    return new Object[][]{
            {"xHi", "Hi"},
            {"Hxi", "Hi"},
            {"Hi", "Hi"}
    };
}

@Test(dataProvider = "word")
    public void testWithoutX2(String str, String expected){
    assertEquals(withoutx2.withoutX2(str), expected);
}
}