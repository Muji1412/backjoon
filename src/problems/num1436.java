package problems;

import java.util.Scanner;

public class num1436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        int i = 0;
        while (count<n) {
            i++;
            if (String.valueOf(i).contains("666")) {
                count++;
                if (count == n) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
