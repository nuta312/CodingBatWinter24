package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.BackAround;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BackAroundTest {
    @Test(dataProvider = "backAroundDP")
    public void testBackAround(String str, String excepted) {
        BackAround ba = new BackAround();
        assertEquals(ba.backAround(str), excepted);
    }

    @DataProvider(name = "backAroundDP")
    public Object[][] backAroundDP() {
        return new Object[][]{{"cat", "tcatt"},
                {"Hello", "oHelloo"},
                {"a", "aaa"},
                {"abc", "cabcc"},
                {"read", "dreadd"},
                {"boo", "obooo"}};
    }

}