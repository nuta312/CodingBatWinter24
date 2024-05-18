package zharkyn.string1_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HelloNameTest {

   @Test (dataProvider = "helloNameDataProvider")
//   public void testHelloName(String name, String expected){
//       HelloName helloName = new HelloName();
//       assertEquals(helloName.helloName(name), expected);
//   }

    @DataProvider (name = "helloNameDataProvider")
    public Object[][] helloNameDataProvider(){
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
