package aisuluu.string1_test;

import digital_nomads.aisuluu.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbbaTest {
    @Test (dataProvider = "abbatest")
    public void testMakeAbba (String a, String b, String exp){
        MakeAbba makeabba = new MakeAbba();
        String result = makeabba.makeAbba(a, b);
        Assert.assertEquals(result, exp);
    }

    @DataProvider
    public String [][] abbatest(){
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
