package problems;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int h = scanner.nextInt();
            int m = scanner.nextInt();
            int time = scanner.nextInt();

            int M = m + time;
            if (M > 60) {
                h = h + (m / 60);
                M = M % 60;
            }
            System.out.println("h = " + h);
            System.out.println("M = " + M);


        }
    }

