package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.DelDel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DelDelTest {
    @Test(dataProvider = "deldelDP")
    public void testDelDel(String str, String excepted) {
        DelDel dd = new DelDel();
        assertEquals(dd.delDel(str), excepted);
    }

    @DataProvider(name = "deldelDP")
    public Object[][] deldelDP() {
        return new Object[][]{{"adelbc", "abc"},
                {"adelHello", "aHello"},
                {"adedbc", "adedbc"},
                {"abcdel", "abcdel"},
                {"add", "add"},
                {"ad", "ad"},
                {"a", "a"},
                {"", ""},
                {"del", "del"},
                {"adel", "a"},
                {"aadelbb", "aadelbb"}};
    }

}