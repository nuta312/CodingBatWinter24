package com.digital_nomads.eldar.str1;

public class MakeTags {
    /*
    The web is built with HTML strings like "<i>Yay</i>"
    which draws Yay as italic text. In this example, the "i"
     tag makes <i> and </i> which surround the word "Yay".
     Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".


     */
    public String makeTags (String a, String b){
  return "<"+a+">"+b+"</"+a+">";
    }
}
