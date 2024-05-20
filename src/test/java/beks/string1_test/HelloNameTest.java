package beks.string1_test;

import com.digital_nomads.beks.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {
    @Test(dataProvider = "HelloNameTest")
    public void testHelloName1(String name,String expected){
        HelloName helloName  = new HelloName();
        String result = helloName.helloName(name);
        Assert.assertEquals(helloName.helloName(name), result);
    }
    @DataProvider
    public Object [][] HelloNameTest(){
        return new Object[][]{
                {"Bob", "Hello Bob!"},
                {"Alice", "Hello Alice!"},
                {"X", "Hello X!"},
                {"Dolly", "Hello Dolly!"},
        };
    }
}
