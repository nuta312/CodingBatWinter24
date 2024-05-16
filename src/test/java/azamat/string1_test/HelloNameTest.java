package azamat.string1_test;

import com.digital_nomads.azamat.string1.HelloName;

public class HelloNameTest {

    @Test
    public void testHelloName (){
        HelloName helloName = new HelloName();
        Assert.assertEquals(helloName.helloNam("Bob", ));
    }
}
