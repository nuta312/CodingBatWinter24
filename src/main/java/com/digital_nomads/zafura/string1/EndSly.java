package com.digital_nomads.zafura.string1;

public class EndSly {
    public boolean endsLy(String str) {
        int num = str.length();
        if(str.length()<2){
            return false;

        } return str.charAt(str.length()-2)=='l'&&str.charAt(str.length()-1) =='y';

    }
}
