package week5._22_10_17;

/*

00000*
0000***
000*****
00*******
0*********

(행) i = 5
(열) j = 1, k = 1
j: 0 출력
k: * 출력

i=1
j=1, j=2, j=3, j=4, j=5
k=1

i=2
j=1, j=2, j=3, j=4
k=1, =2, =3

j=3
j=1, j=2, j=3
k=1, k=2, k=3, k=4, k=5

i는 1씩 증가
j는 1씩 감소
k는 홀수로 증가 (2*j-1)

 */


public class Pyramid {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (6-i); j++) {
                System.out.print(0);
            }

            // 아래에서 조건식 k<=(2*k-1)이 안 되는 이유는? i는 1~5까지 끝나는 조건이 있어서 가능함
            for (int k = 1; k <= (2*i-1); k++){
                System.out.print("*");
            }

            System.out.printf("\n");
        }
    }
}
