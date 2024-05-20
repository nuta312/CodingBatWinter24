package aisuluu.string1_test;

import com.digital_nomads.aisuluu.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {

    @Test(dataProvider = "names")

    public void testHelloName (String name, String exp){
        HelloName hello = new HelloName();
        String result = hello.helloName(name);
        Assert.assertEquals(hello.helloName(name),result);
    }
  @DataProvider
    public String [][] names(){
        return new String[][]{
                {"Bob", "Hello Bob!"},
                {"Alice", "Hello Alice!"},
                {"X", "Hello X!"},
                {"Dolly", "Hello Dolly!"},
                {"Alpha", "Hello Alpha!"},
                {"Omega", "Hello Omega!"},
                {"Goodbye", "Hello Goodbye!"},
                {"ho ho ho", "Hello ho ho ho!"},
                {"xyz!", "Hello xyz!!"},
                {"Hello", "Hello Hello!"},
        };

    }
}
