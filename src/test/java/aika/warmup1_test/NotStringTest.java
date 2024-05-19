package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.NotString;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NotStringTest {
    @Test(dataProvider = "notStringDP")
    public void testNotString(String str, String excepted) {
        NotString nt = new NotString();
        assertEquals(nt.notString(str), excepted);
    }

    @DataProvider(name = "notStringDP")
    public Object[][] notStringDP() {
        return new Object[][]{{"candy", "not candy"},
                {"x", "not x"},
                {"not bad", "not bad"},
                {"bad", "not bad"},
                {"not", "not"},
                {"is not", "not is not"},
                {"no", "not no"}};
    }

}