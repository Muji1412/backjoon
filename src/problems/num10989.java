package problems;

import java.util.Scanner;

public class num10989 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        sortBySelectionSort(numbers);
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);

        }
    }


    public static void swap(int[] arr, int idx1, int idx2) {

        //어레이에서 1 2 교환하기
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
    public static void sortBySelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { //시작부터 끝까지 돌리기
            int minIdx = i; //미니멈값
            for (int j = i + 1; j < arr.length; j++) { // j = 1,
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }
    }
}
