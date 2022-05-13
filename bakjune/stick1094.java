package bakjune;

import java.util.Scanner;

public class stick1094 {

    public static void main(String[] args) {
        double bar = 64;
        double x = new Scanner(System.in).nextDouble();

        int result = 0;
        while (x > 0) {
            if (bar > x)
                bar /= 2;
            else {
                x -= bar;
                result++;
            }
        }
        System.out.println(result);

    }
}
