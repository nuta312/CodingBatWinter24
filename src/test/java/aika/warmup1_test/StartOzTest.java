package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.StartOz;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StartOzTest {
    @Test(dataProvider = "startOzDP")
    public void testStartOz(String str, String excepted) {
        StartOz so = new StartOz();
        assertEquals(so.startOz(str), excepted);
    }

    @DataProvider(name = "startOzDP")
    public Object[][] startOzDP() {
        return new Object[][]{{"ozymandias", "oz"},
                {"bzoo", "z"},
                {"oxx", "o"},
                {"oz", "oz"},
                {"ounce", "o"},
                {"o", "o"},
                {"abc", ""},
                {"", ""},
                {"zoo", ""},
                {"aztec", "z"},
                {"zzzz", "z"},
                {"oznic", "oz"}};
    }
}