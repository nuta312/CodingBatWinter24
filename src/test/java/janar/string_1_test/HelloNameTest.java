package janar.string_1_test;

import com.digital_nomads.janar.string_1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HelloNameTest {

    @Test
    public void testHelloName(){
        HelloName helloName = new HelloName();
        assertEquals(helloName.helloName("Bob"),"Hello Bob!");
    }

    @DataProvider(name = "namesProvider")
    public Object[][] namesProvider(){
        return new Object[][]{
            {"Bob", "Hello Bob!"},
            {"Alice", "Hello Alice!"},
            {"X","Hello X!"},
            {"Dolly", "Hello Dolly!"},
            {"Alpha", "Hello Alpha!"},
            {"Omega", "Hello Omega!"},
            {"Goodbye", "Hello Goodbye!"},
            {"ho ho ho", "Hello ho ho ho!"},
            {"xyz!", "Hello xyz!!"},
            {"Hello", "Hello Hello!"},
        };
    }

    @Test(dataProvider = "namesProvider")
    public void testHelloName(String name, String expected){
        String result = helloName(name);
        assertEquals(result, expected);
    }

    private String helloName(String name) {
        return  "Hello " + name + "!";
    }

}
