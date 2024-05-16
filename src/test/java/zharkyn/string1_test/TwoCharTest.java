package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.NTwice;
import com.digital_nomads.zharkyn.string1.TwoChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoCharTest {

    @Test(dataProvider = "twoCharDataProvider")
    public void  twoCharTest(String a, int n, String str){
        TwoChar twoChar = new TwoChar();
        Assert.assertEquals(twoChar.twoChar(a,n), str);
    }

    @DataProvider(name = "twoCharDataProvider")
    public Object[][]  twoCharDataProvider(){
        return new Object[][] {
                {"java", 0, "ja"},
                {"java", 2, "va"},
                {"java", 3, "ja"},
                {"java", 4, "ja"},
                {"java", -1, "ja"},
                {"Hello", 0, "He"},
                {"Hello", 1, "el"},
                {"Hello", 99, "He"},
                {"Hello", 3, "lo"},
                {"Hello", 4, "He"},
                {"Hello", 5, "He"},
                {"Hello", -7, "He"},
                {"Hello", 6, "He"},
                {"Hello", -1, "He"},
                {"yay", 0, "ya"}
        };
    }
}
