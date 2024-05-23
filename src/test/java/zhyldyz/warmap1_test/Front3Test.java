package zhyldyz.warmap1_test;

import com.digital_nomads.zhyldyz.warmap1.Front3;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Front3Test {

   Front3 front3 = new Front3();

    @Test(dataProvider = "front3DataProvider")
    void front3Test(String str, String expected){

        assertEquals(front3.front3(str), expected);
    }

    @DataProvider(name = "front3DataProvider")
    public String[][] front3DataProvider(){

        return new String[][]{

                {"Java", "JavJavJav"},
                {"Chocolate", "ChoChoCho"},
                {"abc", "abcabcabc"},
                {"abcXYZ", "abcabcabc"},
                {"ab", "ababab"},
                {"a", "aaa"},
                {"", ""}
        };
    }
}