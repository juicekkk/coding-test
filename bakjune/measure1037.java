package bakjune;

import java.util.Arrays;
import java.util.Scanner;

public class measure1037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        Arrays.sort(A);

        System.out.println(A[0] * A[N - 1]);

    }
}