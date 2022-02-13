package vaadin;

import java.util.Collections;
import java.util.HashSet;

/**
 * @author MKushwaha
 */
public class SecondProblem {

    public static int solution (int N, int removeNumber){

        // Number to be removed
        char expectedChar = (char) (removeNumber+'0');

        // Getting HasSet for unique number
        HashSet<Integer> intSet = new HashSet<>();

        // Loop count to remove 5 digit
        String value = String.valueOf(N);

        //Creating StringBuilder Object as we have method to remove character
        StringBuilder db = new StringBuilder(value);
        // Looping to length of given number
        for(int i=0; i<db.length(); i++){
            if(db.charAt(i) == expectedChar){
                // keeping in separate object just to delete digit 5 in this and push in set
                StringBuilder removeExpectedDigit = new StringBuilder(db);
                removeExpectedDigit.deleteCharAt(i);
                Integer integer = Integer.valueOf(removeExpectedDigit.toString());
                intSet.add(integer);
                // making object null for garbage collection
                removeExpectedDigit = null;
            }
        }
        return Collections.max(intSet);
    }


    public static void main(String[] args)
    {
        int n = 15958;
        System.out.println(solution(n, 5));

        int n2 = -5859;
        System.out.println(solution(n2, 5));

        int n3 = -5000;
        System.out.println(solution(n3, 5));
    }
}
