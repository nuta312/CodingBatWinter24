package azamat.string1_test;

import com.digital_nomads.azamat.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MakeAbbaTest {
    @Test(dataProvider = "makeAbbaDataProvider")
    public void testMakeAbba(String a, String b, String expected) {
        MakeAbba makeAbba = new MakeAbba();
        assertEquals(makeAbba.makeAbba(a, b), expected);
    }

    @DataProvider
    public Object[][] makeAbbaDataProvider() {
        return new Object[][]{
                {"Hi", "Bye", "HiByeByeHi"},
                {"Yo", "Alice", "YoAliceAliceYo"},
                {"What", "Up", "WhatUpUpWhat"},
                {"", "", ""},
                {"Test", "", "TestTest"},
                {"", "Test", "TestTest"}
        };
    }
}