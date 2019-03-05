package com.stackroute;
import java.util.Scanner;

public class ReverseWords {

    public static String wordRev(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb = sb.reverse();
        str = sb.toString();
        String arrStr[] = str.split(" ");
        int i;
        String newStr = "";
        for (i=arrStr.length-1; i>=0; i--){
            newStr = newStr + arrStr[i] + " ";
        }
        return newStr.trim();
    }
    
}
