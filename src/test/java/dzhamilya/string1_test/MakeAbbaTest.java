package dzhamilya.string1_test;

import com.digital_nomads.dzhamilya.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbbaTest {
    @Test
            (dataProvider = "abbaTest")
    public void testMakeAbba(String a, String b, String expected) {
        MakeAbba make = new MakeAbba();
        String result = make.makeAbba(a, b);
        Assert.assertEquals(result, expected);
    }
    @DataProvider
    public Object[][] abbaTest() {
        return new Object[][] {
                {"Hi", "Bye" , "HiByeByeHi"},
                {"Yo", "Alice", "YoAliceAliceYo"},
                {"What", "Up", "WhatUpUpWhat"},
                {"aaa", "bbb", "aaabbbbbbaaa"},
                {"x", "y", "xyyx"},
                {"x", "", "xx"},
                {"", "y", "yy"},
                {"Bo", "Ya","BoYaYaBo"},
                {"Ya", "Ya","YaYaYaYa"},

        };
    }
}