package akylai.string1_test;

import com.digital_nomads.akylai.string1.ConCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConCatTest {

    ConCat conCat = new ConCat();

    @Test(dataProvider = "testConCat")
    public void conCatTestMethods(String a, String b) {
        Assert.assertEquals(conCat.conCat(a, b),  a.endsWith("" + b.charAt(0)) ?
                a + b.substring(1) : a + b);
    }

    @DataProvider
    public String[][] testConCat(){
        return new String[][]{
                {"abc", "cat"},
                {"dog", "cat"},
                {"", "cat"},
                {"pig", "g"},
                {"pig", "doggy"}
        };
    }


}
