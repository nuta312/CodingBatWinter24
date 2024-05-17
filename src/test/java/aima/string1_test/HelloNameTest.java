package aima.string1_test;

import com.digital_nomads.aima.string1.HelloName;

public class HelloNameTest {

    @Test
    public void testHelloName(){
        HelloName helloName = new HelloName();
        Assert.assertEquals(helloName.helloName("Bob"),"Hello Bob !");
    }

}
