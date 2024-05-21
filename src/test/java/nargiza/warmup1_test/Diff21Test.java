package nargiza.string1_test;

import com.digital_nomads.nargiza.warmup1.Diff21;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Diff21Test {

    Diff21 diff21 = new Diff21();

    @DataProvider(name = "word")
    public Object[][] getDiff21(){
    return new Object[][]{
            {19, 2},
            {10, 11},
            {21, 0}
    };
}

@Test(dataProvider = "word")
    public void testDiff21(int n, int expected){
    assertEquals(diff21.diff21(n), expected);
}
}