package algorthms.graph;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 6, 4, 1, 2};
        Test test = new Test();
        System.out.println(test.solution(arr));

    }
    public int solution(int[] arr) {
        int smallestInt = 1;

        if (arr.length == 0) return smallestInt;

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("after sort");
        System.out.println(Arrays.toString(arr));

        if (arr[0] > 1) return smallestInt;
        System.out.println("P - "+smallestInt);
        if (arr[arr.length - 1] <= 0) return smallestInt;
        System.out.println("Q - "+smallestInt);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallestInt) {
                smallestInt++;
            }
        }

        return smallestInt;
    }
}