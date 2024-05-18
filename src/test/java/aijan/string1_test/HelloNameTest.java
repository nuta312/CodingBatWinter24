package aijan.string1_test;

import com.digital_nomads.aijan.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HelloNameTest {

//    @Test
//    public void testHelloName() {
//        HelloName helloName = new HelloName();
//        Assert.assertEquals(helloName.helloName("Bob"), "Hello Bob!");
//    }



    @Test(dataProvider = "names")
public void testHelloName(String name, String result) {
        HelloName helloName = new HelloName();
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


