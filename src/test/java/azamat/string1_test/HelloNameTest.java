package azamat.string1_test;

import com.digital_nomads.azamat.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HelloNameTest {

  @Test (dataProvider = "helloNameDataProvider")
    public void testHelloName (String  name, String expected){
        HelloName helloName = new HelloName();
      assertEquals(helloName.helloName(name), expected);

    }
    @DataProvider

    public Object [][] helloNameDataProvider(){
        return new Object[][] {
                {"Alice", "Hello Alice!"},
                {"X", "Hello X!"},
                {"Dolly","Hello Dolly!"},
                {"Alpha","Hello Alpha!"},
                {"Omega","Hello Omega!"},
                {"Goodbye","Hello Goodbye!"},
                {"ho ho ho","Hello ho ho ho!"},
                {"xyz","Hello xyz!"},
                {"Hello","Hello Hello!"}


        };
    }
}
