package problems;

import java.util.Scanner;

public class num2775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int tc = scanner.nextInt();
        int answer = ppl(4, 5);
        System.out.println("answer = " + answer);
    }

    public static int ppl(int a, int b) {
        //a 는 층, b는 호수
        //3층 5호: 1 + 4 + 10 + 20 + 35 = 70명
        //3 6 10 15 21
        // 3층 4호라고 할때, 1 + 4 + 10 + 20 이런식으로 1 3 6 10 15 21.. 늘어남
        //시작은 3,4,5,6,7..
        //값을 하나 더 만들어줘야함. 3층이면 더하는 값이 2부터 시작
        // 3-1, 3-2, 3-3, 3-4 <이렇게 나와야함. 3+4=7나오는데,345 더해줘야함
        int add = a;
        int sum = 1+a;
        int idk = 0;
        for (int i = a; i<=b+a-3;i++) {
            System.out.println("i = " + i);
            add += i; // 0 + 3, 0 3 4, 0 3 4 5,
            System.out.println("add = " + add);
            sum += add;
            System.out.println("sum = " + sum);
            idk += sum;
            System.out.println("idk = " + idk);
        }
        return idk+1+a;
    }
}
