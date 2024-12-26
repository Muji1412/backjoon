package problems;

import java.util.Scanner;

public class num10773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                array[i] = -1;
                for (int j = i; j >= 0; j--) {
                    if (array[j] == 0 && array[j] != -1) {
                        array[j] = 0;
                    }
                }

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
