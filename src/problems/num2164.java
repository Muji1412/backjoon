package problems;

import java.util.Scanner;

public class num2164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] deck = new int[n];

        for (int i = 1; i <= n; i++) {
            deck[i - 1] = i;
        }
        killCard(deck);
        changeCard(deck);

        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }

    }

    public static void killCard(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[i] = 0;
                break;
            }
        }
    }

    private static void changeCard(int[] arr) {
        int tempIis = -1;
        int tempI = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                tempIis = arr[i];
                tempI = i;
            }

        }
}

}
