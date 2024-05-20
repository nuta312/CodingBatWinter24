package com.digital_nomads.zharkyn.warmup1;

public class ParrotTrouble {

 /*У нас есть громко говорящий попугай. Параметр «час» — текущее время часа в диапазоне 0..23.
  У нас проблемы, если попугай разговаривает, а час до 7 или после 20.
  Верните true, если у нас проблемы.*/

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && ( hour < 7 || hour > 20)) {
            return true;
        } else return false;
    }

}
