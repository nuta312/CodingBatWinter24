package mika.string1_test;

import com.digital_nomads.mika.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Objects;


public class HelloNameTest {

    @DataProvider
    public Object [] [] helloNameTest() {
        return new Object[] [] {
                {"Bob", "Hello Bob!"},
                {"Alice", "Hello Alice!"},
                {"X", "Hello X!"},
                {"Dolly", "Hello Dolly!"},
                {"Alpha", "Hello Alpha!"},
                {"Omega", "Hello Omega!"},
                {"Goodbye", "Hello Goodbye!"},
                {"ho ho ho", "Hello ho ho ho!"},
                {"xyz", "Hello xyz!"},
                {"Hello", "Hello Hello!"},
        };
    }

    @Test (dataProvider = "helloNameTest")
    public void testHelloName(String name, String expected) {
        HelloName helloName = new HelloName();
        String result = helloName.helloName(name);
        Assert.assertEquals(result,expected);

    }

}
