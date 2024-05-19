package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.EndUp;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EndUpTest {
    @Test(dataProvider = "endUpDP")
    public void testEndUp(String str, String excepted) {
        EndUp eu = new EndUp();
        assertEquals(eu.endUp(str), excepted);
    }

    @DataProvider(name = "endUpDP")
    public Object[][] endUpDP() {
        return new Object[][]{{"Hello", "HeLLO"},
                {"hi there", "hi thERE"},
                {"hi", "HI"},
                {"woo hoo", "woo HOO"},
                {"xyz12", "xyZ12"},
                {"x", "X"},
                {"", ""}};
    }
}