package dzhamilya.string1_test;

import com.digital_nomads.demo.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {
    @Test
    public void testHelloName(){
        HelloName helloName = new HelloName();
        Assert.assertEquals(helloName.helloName("Bob"),"Hello Bob!");
    }
    @DataProvider
    public Object[][] nameTest() {
        return new Object[][] {
                {"Bob", "Hello Bob!"},
                {"Alice", "Hello Alice!"},
                {"X", "Hello X!"},
                {"Dolly", "Hello Dolly!"},
                {"Alpha", "Hello Alpha!"},
                {"Omega", "Hello Omega!"},
                {"ho ho ho", "Hello ho ho ho!"},
                {"xyz!", "Hello xyz!!"},
                {"Hello", "Hello Hello!"}

        };
    }

}
