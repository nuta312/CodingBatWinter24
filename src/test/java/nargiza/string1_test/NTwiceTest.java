package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.NTwice;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NTwiceTest {

NTwice nTwice = new NTwice();

@DataProvider(name = "getNTwice")
    public Object[][] getNTwice(){
    return new Object[][]{
            {"Hello", 2, "Helo"},
            {"Chocolate", 3, "Choate"},
            {"Chocolate", 1, "Ce"}
    };
}

@Test(dataProvider = "getNTwice")
    public void testNTwice(String str, int n, String expected){
    String result = nTwice.nTwice(str, n);
    Assert.assertEquals(result, expected);
}

}