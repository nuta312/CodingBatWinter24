package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.ConCat;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ConCatTest {

    ConCat conCat = new ConCat();

    @Test(dataProvider = "conCatDataProvider")
    void conCat(String a, String b, String exception) {

        assertEquals(conCat.conCat(a, b), exception);

    }

    @DataProvider(name = "conCatDataProvider")
    public String[][] conCatDataProvider() {

        return new String[][]{

                {"abc", "cat", "abcat"},
                {"dog", "cat", "dogcat"},
                {"abc", "", "abc"},
                {"", "cat", "cat"},
                {"pig", "g", "pig"},
                {"pig", "doggy", "pigdoggy"}
        };
    }
}