package alihan.string1_test;

import com.digital_nomads.alihan.string1.ExtraEnd;
import com.digital_nomads.alihan.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {

    @Test(dataProvider = "TestExtraEnd")
    public void ExtraEndTest(String name, String expected){
        ExtraEnd extraEndTest  = new ExtraEnd();
        String result = extraEndTest.extraEnd(name);
        assert result.equals(expected);
    }


    @DataProvider
    public Object [][]  TestExtraEnd(){
        return new Object[][]{
                {"ab", "ababab"},
                {"Hi", "HiHiHi"},
                {"Candy", "dydydy"},
                {"Code", "dedede"},
                {"Hello", "lololo"},
        };
    }
}

