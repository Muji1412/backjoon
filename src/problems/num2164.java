package problems;

import java.util.Scanner;

public class num2164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] deck = new int[n];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = n;
            n--;
            System.out.println(deck[i]);
        }
        int count0 = -1;
        int leng1 = deck.length - 1;
        while (true) {
            for (int i = 0; i < 2; i++) {

            }
        }


    }
    public static int countOccurrences(int[] array, int value) {
        int count = 0;
        for (int num : array) {
            if (num == value) {
                count++;
            }
        }
        return count;
    }

}
