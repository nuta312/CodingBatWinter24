package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbbaTest {
    MakeAbba makeAbba = new MakeAbba();

    @Test(dataProvider = "makeAbba")
    public void testMakeAbba(String a, String b, String expected) {
        Assert.assertEquals(makeAbba.makeAbba(a, b), expected);
    }

    @DataProvider
    public String[][] makeAbba() {
        return new String[][]{
                {"Hi", "Bye", "HiByeByeHi"},
                {"Yo", "Alice", "YoAliceAliceYo"},
                {"What", "Up", "WhatUpUpWhat"},
                {"aaa", "bbb", "aaabbbbbbaaa"},
                {"x", "y", "xyyx"},
                {"x", "", "xx"},
                {"", "y", "yy"},
                {"Bo", "Ya", "BoYaYaBo"},
                {"Ya", "Ya", "YaYaYaYa"},
        };
    }
}
