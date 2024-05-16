package demo.string1_test;

import com.digital_nomads.demo.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {

    @DataProvider(name = "names")
    public Object[][] namesData() {
        return new Object[][] {
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

    @Test(dataProvider = "names")
    public void testHelloName(String name, String expected){
        HelloName helloName = new HelloName();
        Assert.assertEquals(helloName.helloName(name), expected);
    }
}
