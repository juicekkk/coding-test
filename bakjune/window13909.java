package bakjune;

import java.util.Scanner;

public class window13909 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;
        for(int i=1; i*i<=n; i++)
            cnt++;

        System.out.println(cnt);
    }

}
