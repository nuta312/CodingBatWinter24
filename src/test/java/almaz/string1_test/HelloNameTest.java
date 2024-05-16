package almaz.string1_test;

import com.digital_nomads.almaz.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloNameTest {

    @Test
    public void testHelloName(){
        HelloName helloName = new HelloName();
        Assert.assertEquals(helloName.helloName("Bob"), "Hello Bob!");
    }
}
