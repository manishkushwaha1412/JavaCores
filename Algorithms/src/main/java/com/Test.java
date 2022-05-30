public class Test {
    int solution(int[] A) {

        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            if (ans >= A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = new int[]{-100, 1, -2000, -1000};
         // {-1, 1, -2,2}; {-1, 1, -3,2}; {-1, 1, -3,-100};
        Test test = new Test();
        System.out.println(test.solution(a));
    }
}
