package com.digital_nomads.zhyldyz.warmap1;

public class ParrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {
        if ((hour < 7 || 20 < hour) && talking) {
            return true;
        } else {
            return false;
        }
    }

}
