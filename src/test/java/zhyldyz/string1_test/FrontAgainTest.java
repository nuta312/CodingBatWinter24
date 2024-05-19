package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.FrontAgain;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrontAgainTest {

    FrontAgain frontAgain = new FrontAgain();

    @Test(dataProvider = "frontAgainDataProvider")
    void frontAgainTest(String str, Boolean excepted) {

        assertEquals(frontAgain.frontAgain(str), excepted);

    }

    @DataProvider(name = "frontAgainDataProvider")
    public Object[][] frontAgainDataProvider() {

        return new Object[][]{

                {"ed", true},
                {"jj", true},
                {"jjjj", true},
                {"jjjk", false},
                {"x", false},
                {"", false},
                {"edited", true},
                {"edit", false}
        };
    }

}