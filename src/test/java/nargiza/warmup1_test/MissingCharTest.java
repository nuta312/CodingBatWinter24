package nargiza.warmup1_test;

import com.digital_nomads.nargiza.warmup1.MissingChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MissingCharTest {

MissingChar missingChar = new MissingChar();

@DataProvider(name = "getMissingChar")
    public Object[][] getMissingChar(){
    return new Object[][]{
            {"kitten", 1, "ktten"},
            {"kitten", 0, "itten"},
            {"kitten", 4, "kittn"}
    };
}

@Test(dataProvider = "getMissingChar")
    public void testMissingChar(String str, int n, String expected){
String result = missingChar.missingChar(str, n);
    Assert.assertEquals(result, expected);
}
}