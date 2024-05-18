package aika.string1_test;

import com.digital_nomads.aika.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloNameTest {
    @Test(dataProvider = "testHelloName1DataProvider")
    public void testHelloName1(String name, String expected) {
        HelloName helloName = new HelloName();
        Assert.assertEquals(helloName.helloName(name), expected);
    }

    @DataProvider(name = "testHelloName1DataProvider")
    public String[][] testHelloName1DataProvider() {
        return new String[][]{
                {"Bob", "Hello Bob!"},
                {"Alice", "Hello Alice!"},
                {"X", "Hello X!"},
                {"Dolly", "Hello Dolly!"},
                {"ho ho ho", "Hello ho ho ho!"}};
    }
}