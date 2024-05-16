package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.HelloName;

public class HelloNameTest {

    public void testHelloName(){
        HelloName helloName = new HelloName();
Assert.assertEquals(helloName.helloName("Bob"));
    }
}
