package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.IcyHot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IcyHotTest {
    @Test(dataProvider = "icyHotDP")
    public void testIcyHot(int temp1, int temp2, boolean expected) {
        IcyHot ih = new IcyHot();
        Assert.assertEquals(ih.icyHot(temp1, temp2), expected);

    }

    @DataProvider(name = "icyHotDP")
    public Object[][] icyHotDP() {
        return new Object[][]{{120, -1, true},
                {-1, 120, true},
                {2, 120, false},
                {-1, 100, false},
                {-2, -2, false},
                {120, 120, false}};
    }

}