package aizada.string1_test;

import com.digital_nomads.aizada.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {


    @Test(dataProvider = "testHelloName")
    public void helloNameTest (String name, String expectedGreeting){
        HelloName helloName = new HelloName();

        Assert.assertEquals(helloName.helloName(name), expectedGreeting);
    }

    @DataProvider (name = "testHelloName")
public Object [][] helloName (){
        return new Object[][]{
                {"Bob", "Hello Bob!"},
                {"X", "Hello X!"},
                {"Alice", "Hello Alice!"},
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
