import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4}, 4)));
    }
}

class Solution {
    public int[] solution(int[] A, int K) {

        int iterNumber = K;
        int length = A.length;
        int[] B = new int[length];

        do {
            iterNumber--;

            int cout = -1;
            for (int i = length - 1; i > length - 2; i--) {
                cout++;
                B[cout] = A[i];
            }
            for (int j = 0; j < length - 1; j++) {
                cout++;
                B[cout] = A[j];
            }
            for (int k = 0; k < length; k++) {
                A[k] = B[k];
            }

        } while (iterNumber > 0);

        return A;
    }
}



