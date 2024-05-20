package Gaukhar.String1;

import com.digital_nomads.gaukhar.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {
    @Test (dataProvider = "HelloNameTest" )
    public void testHelloName(String name, String expected ){
        HelloName halloName = new HelloName();
        Assert.assertEquals(halloName.halloName("Bob"), "Hello Bob!");
        String result = halloName.halloName(name);
        assert result.equals(expected);
    }

    @DataProvider
    public Object [][] HelloNameTest(){
        return new Object[][]{
                {"Bob", "Hello Bob!"},
                {"Alice", "Hello Alice!"},
                {"X", "Hello X!"},
                {"Dolly", "Hello Dolly!"},
        };
    }
    }

