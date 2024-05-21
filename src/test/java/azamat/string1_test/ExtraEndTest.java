package azamat.string1_test;

import com.digital_nomads.azamat.string1.ExtraEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExtraEndTest {
    @Test (dataProvider = "extraEndDataProvider")
    public void testExtraEnd (String str, String expected){
        ExtraEnd extraEnd = new ExtraEnd();
        assertEquals (extraEnd.extraEnd(str), expected);
    }
    @DataProvider
    public Object [][] extraEndDataProvider(){
        return new Object[][]{
                {"Hello","lololo"},
                {"ab", "ababab"},
                {"Hi", "HiHiHi"},
                {"Code", "dedede"},
        };
    }
}
