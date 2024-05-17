package eldorados_test.str1.test;

import com.digital_nomads.eldorado.str1.MakeABBA;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _2MakeABBA {

    @Test (dataProvider = "MABBAT")
    public void testABBA(String a, String b, String e) {
        MakeABBA abba = new MakeABBA();
        String res = abba.makeAbba(a,b);
        assert res.equals(e);

    }

    @DataProvider
    public Object[][] MABBAT() {
        return new Object[][]{
                {"Hi", "Bye", "HiByeByeHi"},
                {"Yo","Alice","YoAliceAliceYo"},
                {"What","Up","WhatUpUpWhat"},
                {"phone","Apple", "phoneAppleApplephone"},
        };

    }
}
