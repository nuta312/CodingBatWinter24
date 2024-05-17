package ayzada.string1_test;

import com.digital_nomads.ayzada.string1.HelloName;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {
        @Test(dataProvider = "HelloName Test ")
        public void testHelloName(String name, String expected){
            HelloName helloName = new HelloName();
            String result = helloName.helloName(name);
            assert result.equals(expected);

        }


        @DataProvider (name = "HelloNameTest")
        public Object[][] nameProvider() {
            return new Object[][]{
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
    }
