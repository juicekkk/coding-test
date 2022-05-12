package bakjune;

import java.util.Scanner;

public class filp1455 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N][M];

        // nextLine직전에 scan.nextLine()을 한번 더써서 입력버퍼를 비워준다.
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String status = sc.nextLine();
            for (int j = 0; j < M; j++) {
                A[i][j] = status.charAt(j) - '0';
            }
        }

        int cnt = 0;
        for (int i = N-1; i >= 0; i--) {
            for (int j = M-1; j >= 0; j--) {
                if (A[i][j] == 1) {
                    cnt++;
                    reverse(A, i, j);
                }
            }
        }
        System.out.println(cnt);
    }

    public static void reverse(int[][] coin, int N, int M) {

        for (int i = N; i >= 0; i--) {
            for (int j = M; j >= 0; j--) {
                coin[i][j] = coin[i][j] == 1 ? 0 : 1;
            }
        }

    }
}