package demo.String1_Test;

import com.digital_nomads.shirin.string1.ComboString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboStringTest {
    @Test(dataProvider = "ComboString")
    public void ComboTest(String a, String b , String expect){
        ComboString combo = new ComboString();
        String str = combo.comboString(a,b);
        Assert.assertEquals(str,expect);
    }

@DataProvider
    public Object [][] ComboString(){
        return new Object[][] {
                {"Hello", "hi" , "hiHellohi"},
                {"hi", "Hello" , "hiHellohi"},
                {"aaa", "b", "baaab" },
                {"b", "aaa" , "baaab"},
                {"aaa", "" , "aaa"},
                {"", "bb" ,"bb"  },
                {"aaa", "1234" , "aaa1234aaa"},
                {"xyz", "ab" , "abxyzab"}
        };
    }
}
