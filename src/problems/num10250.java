package problems;

import java.util.Scanner;

public class num10250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int level = c % a;
            if (level == 0) {
                level++;
            }
            System.out.print(level);
            int hosu = (c / a + 1);

            if (b < 10) {
                System.out.print(hosu);
            } else  {
                if (hosu >= 10) {
                    System.out.println(hosu);
                } else {
                    System.out.print("0");
                    System.out.print(hosu);
                }
            }
            }
    }
}
