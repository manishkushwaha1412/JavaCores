package vaadin;

import java.util.HashSet;

public class Solution {


        public String solution(String S) {

            char str[] = S.toCharArray();
            // Char type empty hashset
            HashSet<Character> h = new HashSet<>();

            // change the input array from left to right
            for (int i=0; i<=str.length-1; i++)
            {
                char c = str[i];

                // If element is already in hash set, update x and and then break
                if (h.contains(c)) {
                    return String.valueOf(c);
                }else {
                    // add element to hash set
                    h.add(c);
                }
            }
            return String.valueOf('\0');
        }
}
