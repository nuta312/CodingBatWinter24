package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {

    @DataProvider
    public Object [][] nameProvider(){
        return new Object[][] {
                {"Alua", "Hello Alua!"},
                {"Erlan", "Hello Erlan!"},
                {"Aidyn", "Hello Aidyn!"},
                {"Bob", "Hello Bob!"}

        };
    }

    @Test
    public void helloNameTest(String name, String expected){
        HelloName helloName = new HelloName();
        Assert.assertEquals(helloName.helloName(name), expected);

    }
}
