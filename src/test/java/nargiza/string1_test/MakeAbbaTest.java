package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeAbbaTest {

    @Test
    public void testMakeAbba(){
        MakeAbba makeAbba = new MakeAbba();
        Assert.assertEquals(makeAbba.makeAbba("What", "Up"), "WhatUpUpWhat");
    }
}
