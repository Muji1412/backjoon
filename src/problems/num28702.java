//package problems;
//
//import java.util.Scanner;
//
//public class num28702 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String a = scanner.nextLine();
//        String b = scanner.nextLine();
//        String c = scanner.nextLine();
//
//        int A = fizzBuzzStr(a);
//        int B = fizzBuzzStr(b);
//        int C = fizzBuzzStr(c);
//
//        System.out.println("A = " + A);
//        System.out.println("B = " + B);
//        System.out.println("C = " + C);
//
//        //fizzbuzz = 0, fizz = 1, buzz = 2, 배수 아님 = -1
//
//        int lastnum = -1;
//
//
//
//
//
//
//
//
//
//    }
//
//    public static String fizzBuzzStr(String a) {
//        if (a.equals("FizzBuzz")) {
//            return "FizzBuzz";
//        }
//        if (a.equals("Fizz")) {
//            return "Fizz";
//        }
//        if (a.equals("Buzz")) {
//            return "Buzz";
//        } else {
//            String temp= a;
//            return temp;
//        }
//    }
//
//    public static int fizzBuzzInt(int a) {
//        if (a % 3 == 0 && a % 5 == 0) {
//            return 0; // fizzbuzz
//        }
//        if (a % 3 == 0 && a % 5 != 0) {
//            return 1; // fizz
//        }
//        if (a % 3 != 0 && a % 5 == 0) {
//            return 2; // buzz
//        } else {
//            return a;
//        }
//    }
//}