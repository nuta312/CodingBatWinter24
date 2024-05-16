package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {
    HelloName helloName = new HelloName();

    @Test(dataProvider = "helloNameDataProvider")
    public void helloNameTest(String name, String expected){
        Assert.assertEquals(helloName.helloName(name), expected);
    }
    @DataProvider(name = "helloNameDataProvider")
    public Object [][] helloNameDataProvider(){
        return new Object[][]{
                {"Bob", "Hello Bob!"},
                {"Alice", "Hello Alice!"},
                {"X", "Hello X!"},
                {"Dolly", "Hello Dolly!"},
                {"ho ho ho", "Hello ho ho ho!"}
        };
    }
}
