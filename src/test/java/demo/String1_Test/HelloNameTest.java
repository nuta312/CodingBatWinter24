package demo.String1_Test;

import com.digital_nomads.aiba.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {


    @Test(dataProvider ="HelloName" )
    public  void  testHelloName(String str , String except){
        HelloName name = new HelloName();
        String a = name.helloName(str);
        Assert.assertEquals(a , except);

    }

@DataProvider
    public Object [][] HelloName(){
        return new  Object[][] {
                {"Bob" , "Hello Bob!"},
                {"Alice" , "Hello Alice!"},
                {"X" ,"Hello X!" },
                {"Dolly" , "Hello Dolly!"},
                {"Alpha" , "Hello Alpha!"},
                {"Omega" , "Hello Omega!"},
                {"Goodbye" ,"Hello Goodbye!" }
        };
    }
}
