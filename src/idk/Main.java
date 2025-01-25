package idk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int count = 1; // 겹 수(최소 루트)
        int range = 2;    // 범위 (최솟값 기준)

        //1인경우 요거만 예외처리해주고

        if (N == 1) {
            System.out.print(1);
        }

        // 아닌 경우에는 이 아래 코드 실행시킬건데


        else {

            // 예를 들어서 13 이 들어왔다
            // 맨 처음에 1이었는데
            // 카운트 1이니까, 레인지가 8이 되겠죠
            // 이 경우에는 아직 while문 안에 있는 문장을 만족시키니까 반복

            // 한번 더 실행해보면
            // count = 2, 레인지가

            // 1회차: range = 7, count = 2
            // 2회차: range = 19, count = 3

            // 핵심이 그냥 하나에요
            // 6, 12, 18 , 24 계속 더해줘서 늘려줘요
            // 그 값이 n보다 커지면 거기가 정답이다
            while (range <= N) {    // 범위가 N보다 커지기 직전까지 반복
                range = range + (6 * count);    // 다음 범위의 최솟값으로 초기화
                count++;    // count 1 증가
            }
            System.out.print(count);

            //근데 1회차: range = 7, count = 2
            // 2회차: range = 19, count = 3  이거는 이해가 갔는데 위에 변수로 int range = 2; 이렇게 넣어서
            // 2<=50 이렇게 되는 거 아닌가여??
            // 그럼 range=2+dk 아  //  int count = 1; // 겹 수(최소 루트

            // 와일문
        }
    }
}

