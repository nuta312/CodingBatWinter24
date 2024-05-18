package com.digital_nomads.dzhamilya.warmup1;

public class SleeIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
}
