package problems;

import java.util.Scanner;

public class num25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int product = scanner.nextInt();
            int amount = scanner.nextInt();
            sum = sum + (product * amount);
        }
        if (total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
