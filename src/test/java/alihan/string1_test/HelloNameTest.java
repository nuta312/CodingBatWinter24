package alihan.string1_test;

import com.digital_nomads.alihan.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {

    @Test(dataProvider = "HelloNameTest")
    public void HelloName(String name, String expected){
        HelloName helloName = new HelloName();
        Assert.assertEquals(helloName.helloName("Bob"), "Hello Bob!");
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
        };
    }
    }
