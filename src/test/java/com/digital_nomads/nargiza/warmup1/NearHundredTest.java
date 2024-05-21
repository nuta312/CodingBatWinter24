package com.digital_nomads.nargiza.warmup1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NearHundredTest {

NearHundred nearHundred = new NearHundred();

@DataProvider(name = "word")
    public Object[][] getNearHundred(){
    return new Object[][]{
            {93, true},
            {90, true},
            {89, false}
    };
}

@Test(dataProvider = "word")
    public void testNearHundred(int n, boolean expected){
    assertEquals(nearHundred.nearHundred(n), expected);
}
}