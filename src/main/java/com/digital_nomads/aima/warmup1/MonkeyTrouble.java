package com.digital_nomads.aima.warmup1;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (!aSmile && bSmile) {
            return false;
        } else if (aSmile && !bSmile) {
            return false;
        }else if (!aSmile && !bSmile) {
            return true;
        } else {
            return true;
        }
    }
}
