package com.digital_nomads.nargiza.warmup1;

public class ParrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && ( hour < 7 || hour > 20)) {
            return true;
        } else return false;
    }
}
