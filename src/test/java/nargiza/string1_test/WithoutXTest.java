package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.WithoutX;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WithoutXTest {

WithoutX withoutX = new WithoutX();

@DataProvider(name = "word")
public Object[][] getWithoutX(){
    return new Object[][]{
            {"xHix", "Hi"},
            {"xHi", "Hi"},
            {"Hxix", "Hxi"}
    };
}

@Test(dataProvider = "word")
    public void testWithoutX(String str, String expected){
    assertEquals(withoutX.withoutX(str), expected);
}
}