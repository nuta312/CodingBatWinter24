package akylai.string1_test;

import com.digital_nomads.akylai.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {

    HelloName helloName = new HelloName();

    @Test(dataProvider = "helloName")
    public void helloNameTest(String name){
        System.out.println("Hello " + name + "!");
        Assert.assertEquals(helloName.helloName(name),"Hello " +name+"!");
    }

    @DataProvider
    public String[][] helloName(){
        return new String[][]{
                {"Alice"},
                {"X"},
                {"Dolly"},
                {"Alpha"},
                {"Omega"},
                {"Goodbye"},
                {"ho ho ho"},
                {"xyz"},
                {"Hello"}
        };
    }
}
