package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbbaTest {

    @Test (dataProvider = "makeAbbaDataProvider")
    public void  makeAbba(String a, String b, String expected) {
        MakeAbba makeAbba = new MakeAbba();
        Assert.assertEquals(makeAbba.makeAbba(a,b),expected);
    }

    @DataProvider (name = "makeAbbaDataProvider")
    public Object[][] makeAbbaDataProvider(){
        return new Object[][]{
                {"Hi", "Bye", "HiByeByeHi"},
                {"Yo", "Alice", "YoAliceAliceYo"},
                {"What", "Up", "WhatUpUpWhat"},
                {"aaa", "bbb",  "aaabbbbbbaaa"},
                {"x", "y", "xyyx"},
                {"x", "", "xx"},
                {"", "y", "yy"},
                {"Bo", "Ya", "BoYaYaBo"},
                {"Ya", "Ya", "YaYaYaYa"}
        };
    }
}
