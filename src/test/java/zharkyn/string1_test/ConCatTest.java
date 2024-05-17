package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.ConCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConCatTest {


    @Test(dataProvider = "conCatDataProvider")
    public void  conCatTest(String a, String b, String expected) {
        ConCat conCat = new ConCat();
        Assert.assertEquals(conCat.conCat(a,b),expected);
    }

    @DataProvider(name = "conCatDataProvider")
    public Object[][] conCatDataProvider(){
        return new Object[][]{
                {"abc", "cat", "abcat"},
                {"dog", "cat", "dogcat"},
                {"abc", "", "abc"},
                {"", "cat",  "cat"},
                {"pig", "g", "pig"},
                {"pig", "doggy", "pigdoggy"}
        };
    }
}
