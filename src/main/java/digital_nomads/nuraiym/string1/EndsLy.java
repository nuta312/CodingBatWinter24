package com.digital_nomads.nuraiym.string1;



    public class EndsLy {
        public boolean endsLy(String str) {
            int i = str.length();
            return str.length() < 2 ? false : str.charAt(i-2) == 'l' && str.charAt(i-1) == 'y';
        }
    }


