package almaz.string1_test;

import com.digital_nomads.almaz.string1.ConCat;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConCatTest {
    @Test(dataProvider = "ConCatTest")
    public void testConCat (String a, String b){
        ConCat conCat = new ConCat();
    }
    @DataProvider
    public Object [][] ConCatTest(){
        return new Object[][]{
                {"abc", "cat"},
                {"dog", "cat"},
                {"abc", ""},
                {"", "cat"},
                {"pig", "g"},
                {"pig", "doggy"},

        };
    }
}
