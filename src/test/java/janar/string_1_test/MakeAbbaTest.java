package janar.string_1_test;

import com.digital_nomads.janar.string_1.MakeAbba;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MakeAbbaTest {

    @Test
    public void testMakeAbba(){
        MakeAbba makeAbba = new MakeAbba();
        assertEquals(makeAbba.makeAbba("Hi","Bye"),"HiByeByeHi");
    }

    @DataProvider(name = "stringsProvider")
    public Object[][] stringsProvider() {
        return new Object[][] {
                {"Hi", "Bye", "HiByeByeHi"},
                {"Yo", "Alice", "YoAliceAliceYo"},
                {"What", "Up", "WhatUpUpWhat"}
        };
    }

    @Test(dataProvider = "stringsProvider")
    public void testMakeAbba(String a, String b, String expected) {
        String result = makeAbba(a, b);
        assertEquals(result, expected);
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

}
