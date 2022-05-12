package bakjune;

import java.util.Arrays;
import java.util.Scanner;

public class sortInside1427 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String status = sc.nextLine();
        int len = status.length();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) arr[i] = status.charAt(i) - '0';

        Arrays.sort(arr);

        for (int i = len - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }

}