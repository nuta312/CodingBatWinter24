package Gaukhar.String1;

import com.digital_nomads.gaukhar.string1.extraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class extraEndTest {
    @Test
            (dataProvider = "extra")
public void testExtraEvd (String str, String e){
        extraEnd ee = new extraEnd();
        String r = ee.extraEnd(str);
        Assert.assertEquals(r,e);


}
@DataProvider
    public Object[][] extra(){
    return new Object[][]{
            {"Hello","lololo"},
            {"ab", "ababab"},
            {"Hi", "HiHiHi"},
            {"Candy","dydydy"},
            {"Code","dedede"},
    };
}



}
