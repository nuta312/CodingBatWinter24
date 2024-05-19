package com.digital_nomads.zhyldyz.warmap1;

public class PosNeg {

    public boolean posNeg(int a, int b, boolean negative) {
        if((a < 0 && b < 0) && negative){
            return true;
        }else if((a < 0 && b > 0) && !negative || (a > 0 && b < 0) && !negative){
            return true;
        }return false;
    }
}
