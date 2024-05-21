package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.HelloName;
import com.digital_nomads.zafura.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEndTest {
    @Test(dataProvider = "Without")
    public void testHelloName(String string, String expected) {
        WithoutEnd withoutEnd= new WithoutEnd();
        Assert.assertEquals(withoutEnd.withoutEnd(string),expected);
    }
    @DataProvider
    public Object[][]Without(){
        return new Object[][]{
                {"Hello","ell"},
                {"java","av" },
                {"coding", "odin"},
                {"code", "od"},
                {"ab",""},

        };
    }
}

