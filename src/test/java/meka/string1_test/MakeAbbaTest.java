package meka.string1_test;

import com.digital_nomads.meka.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbbaTest {

    @Test(dataProvider = "testData")
    public void testMakeAbba(String a, String b, String expected) {
        MakeAbba makeAbba = new MakeAbba();
        String result = makeAbba.makeAbba(a, b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"Hi", "Bye", "HiByeByeHi"},
                {"Yo", "Alice", "YoAliceAliceYo"},
                {"What", "Up", "WhatUpUpWhat"},
                {"aaa", "bbb", "aaabbbbbbaaa"},
                {"x", "y", "xyyx"},
                {"x", "", "xx"},
                {"", "y", "yy"},
                {"Bo", "Ya", "BoYaYaBo"},
                {"Ya", "Ya", "YaYaYaYa"}
        };
    }
}
