package nargiza.warmup1_test;

import com.digital_nomads.nargiza.warmup1.Front3;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Front3Test {

Front3 front3 = new Front3();

@DataProvider(name = "getFront3")
    public Object[][] getFront3(){
    return new Object[][]{
            {"Java", "JavJavJav"},
            {"Chocolate", "ChoChoCho"},
            {"abc", "abcabcabc"}
    };
}

@Test(dataProvider = "getFront3")
    public void testFront3(String str, String expected){
    assertEquals(front3.front3(str), expected);
}
}