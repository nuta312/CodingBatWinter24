package aynura.string1_test;

import com.digital_nomads.aijan.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {
    @Test(dataProvider = "names")
    public void testHelloName(String name, String result) {
        com.digital_nomads.aijan.string1.HelloName helloName = new HelloName();
//        String actualName = helloName.helloName(name);
        Assert.assertEquals(helloName.helloName(name), result);
    }
    @DataProvider(name = "names")
    public Object[][] provideNames() {
        return new Object[][] {
                { "Bob", "Hello Bob!" },
                { "Alice", "Hello Alice!" },
                { "X", "Hello X!" },
                { "Dolly", "Hello Dolly!" },
                { "Alpha", "Hello Alpha!" },
                { "Omega", "Hello Omega!" },
                { "Goodbye", "Hello Goodbye!" },
                { "ho ho ho", "Hello ho ho ho!" },
                { "xyz!", "Hello xyz!!" },
                { "Hello", "Hello Hello!" }
        };
    }

}
