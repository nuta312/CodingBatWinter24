package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.MixStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MixStartTest {
    @Test(dataProvider = "mixStartDP")
    public void testMixStart(String str, boolean excepted) {
        MixStart ms = new MixStart();
        Assert.assertEquals(ms.mixStart(str), excepted);
    }

    @DataProvider(name = "mixStartDP")
    public Object[][] mixStartDP() {
        return new Object[][]{{"mix snacks", true},
                {"pix snacks", true},
                {"piz snacks", false},
                {"nix", true},
                {"ni", false},
                {"n", false},
                {"", false}};
    }
}