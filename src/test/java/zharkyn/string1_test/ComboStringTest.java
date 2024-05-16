package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.ComboString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComboStringTest {

    @Test (dataProvider = "comboStringDataProvider")
    public void comboStringTest(String a, String b, String str){
        ComboString comboString = new ComboString();
        Assert.assertEquals(comboString.comboString(a,b), str);
    }

    @DataProvider (name = "comboStringDataProvider")
    public Object[][] comboStringDataProvider(){
        return new Object[][] {
                {"Hello","hi","hiHellohi"},
                {"hi","Hello","hiHellohi"},
                {"aaa","b","baaab"},
                {"b","aaa","baaab"},
                {"aaa","","aaa"},
                {"","bb","bb"},
                {"aaa","1234","aaa1234aaa"},
                {"aaa","bb","bbaaabb"},
                {"a","bb","abba"},
                {"bb","a","abba"},
                {"xyz","ab","abxyzab"}
        };
    }

}
