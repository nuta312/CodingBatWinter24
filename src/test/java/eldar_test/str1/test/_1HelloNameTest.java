package eldar_test.str1.test;

import com.digital_nomads.eldar.str1._1helloName;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _1HelloNameTest {

@Test(dataProvider = "HnT")
    public void testHN (String str, String expected){
    _1helloName hn = new _1helloName();
    String res = hn.heloName(str);
    assert res.equals(expected);


    }

    @DataProvider
    public Object [][] HnT(){
        return new Object[][]{
                {"Bob", "Hello Bob!"},
                {"Alice", "Hello Alice!"},
                {"X", "Hello X!"},
                {"Eldar", "Hello Eldar!"},
        };
    }
}
