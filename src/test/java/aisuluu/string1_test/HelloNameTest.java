package aisuluu.string1_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {
    @Test(dataProvider = "HelloNameTest")
    public void HelloNameTest(String name, String expected){
        HelloNameTest helloNameTest = new HelloNameTest();
        Assert.assertEquals(helloNameTest.HelloNameTest((name), expected);

    }
    @DataProvider
    public Object[][] HelloNameTest() {
        return new Object[][]{
                {"Bob", "Hello Bob!"},
                {"Alice", "Hello Alice!"},
                {"X", "Hello X!"},
                {"Dolly", "Hello Dolly!"},
                {"Alpha", "Hello Alpha!"},
                {"Omega", "Hello Omega!"},
                {"Goodbye", "Hello Goodbye!"},
                {"ho ho ho", "Hello ho ho ho!"},
                {"xyz!", "Hello xyz!!"},
                {"Hello", "Hello Hello!"}
        };
    }
}
