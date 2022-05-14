package elevenst;

import java.util.Scanner;

public class cote2 {

    public static void main(String[] args) {
        int[] A = new int[]{1, 1, 2,3};
        int K = 2;
        int n = A.length;
        String result = "true";

        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                result = "false1";
        }

        if (A[0] != 1 || A[n - 1] != K)
            result = "false2";
        else
            result = "true3";


        System.out.println("result > " + result);

    }
}
