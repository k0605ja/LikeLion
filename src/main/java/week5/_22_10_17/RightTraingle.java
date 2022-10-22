package week5._22_10_17;

/*
0000*
000**
00***
0****
*****

외부 루프 (행)
i = 5줄 개행

내부 루프(열)
0과 * 2개를 출력하므로 2개를 나눠서 생각하자


j문 = 0 출력
j = 4부터 시작해서 0으로 끝남, 1씩 감소


k = 1부터 시작해서 5로 끝남, 1씩 증가


i=1
j=1, j=2, j=3, j=4 (5-i)
k=1

i=2
j=, j=2, j=3
k=1, k=2

i=3
j=1, j=2
k=1, j=2, k=3

i=4
j=1
k=1, k=2, k=3, k=4

i=5
j=0 (5-i) = 0
k=1, k=2, k=3, k=4, k=5


 */

public class RightTraingle {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (5 - i); j++) {
                System.out.print(0);
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("*");
            }

            System.out.printf("\n");
        }
    }
}