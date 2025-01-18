package problems;

import java.util.Scanner;

public class num1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while (a-- > 0) {
            int n = sc.nextInt(); // 13
            int r = sc.nextInt(); // 29

            int sumN = 1;
            int sumR = 1;
            for (int i = 1; i <= n; i++) {
                sumN *= i;
            }
            for (int i = n + 1; i <= r; i++) {
                sumR *= i;
            }
            System.out.println("sumN = " + sumN);
            System.out.println("sumR = " + sumR);

            System.out.println(sumR / sumN);
        }
    }
}
