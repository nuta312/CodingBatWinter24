package aisuluu.string1_test;

import com.digital_nomads.aisuluu.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbbaTest {
    @Test (dataProvider = "makeabba")
    public void testMakeAbba (String a, String b, String exp){
        MakeAbba makeAbba = new MakeAbba();
        String result = makeAbba.makeAbba(a,b);
        Assert.assertEquals(makeAbba.makeAbba(a, b),exp);

    }
    @DataProvider
    public String [][] makeabba(){
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
