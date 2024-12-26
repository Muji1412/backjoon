package problems;

import java.util.Scanner;

public class num1920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fuck = 0;
        int n = scanner.nextInt();
        int[] arrayN = new int[n];
        for (int i = 0; i < n; i++) {
            arrayN[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] arrayM = new int[m];
        for (int i = 0; i < n; i++) {
            arrayM[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            fuck = 0;
            for (int j = 0; j < n; j++) {
                if (arrayM[i] == arrayN[j]) {
                    fuck++;
                }
            }
            if (fuck == 1) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }
}
