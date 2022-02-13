package com.string.problem;

import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdab";
        System.out.println(checkAnagramString(a, b));
    }

    public static boolean checkAnagramString(String a, String b){
        if(a== null || b == null) return false;

        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        Arrays.sort(charA);
        Arrays.sort(charB);
        return Arrays.equals(charA, charB);



    }
}
