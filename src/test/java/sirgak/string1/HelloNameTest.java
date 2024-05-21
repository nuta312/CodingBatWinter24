package sirgak.string1;

import com.digital_nomads.s1rgak.string1.HelloName;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {
    @Test
    (dataProvider = "HelloNameTest")
    public void testHelloName(String name, String expected){
        HelloName helloName = new HelloName();
        String result = helloName.helloName(name);
        assert result.equals(expected);
    }
    @DataProvider
    public Object [][] HelloNameTest(){
        return new Object[][]{
                {"Bob", "Hello Bob!"},
                {"Alice", "Hello Alice!"},
                {"X", "Hello X!"},
                {"Dolly", "Hello Dolly!"},
                {"Alpha" , "Hello Alpha!"},
                {"Omega", "Hello Omega!"},
                {"Goodbye", "Hello Goodbye!"},
        };
    }
}
