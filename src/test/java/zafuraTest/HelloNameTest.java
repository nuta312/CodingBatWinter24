package zafuraTest;

import com.digital_nomads.zafura.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {
    @Test(dataProvider = "Names")
    public void testHelloName(String name, String expected) {
        HelloName helloName = new HelloName();
        Assert.assertEquals(helloName.helloName(name),expected);
    }
        @DataProvider
                public Object[][]Names(){
            return new Object[][]{
                    {"Bob","Hello Bob!"},
                    {"Alice", "Hello Alice!" },
                    {"X", "Hello X!"},
                    {"Dolly","Hello Dolly!"},
                    {"Alpha","Hello Alpha!"},
                    {"Omega","Hello Omega!"}
            };
        }
    }

