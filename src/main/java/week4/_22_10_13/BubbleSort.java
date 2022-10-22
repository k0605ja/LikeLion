package week4._22_10_13;

/*
1. 가장 작은 숫자가 인덱스 0번 자리에 오도록 하는 알고리즘 만들기

입력값
{7, 2, 3, 9, 28, 11}
결과
{2, 7, 3, 9, 28, 11}

2. static method는 main만 쓰기
3. int형 array를 return하고 array를 받는 sort() 메서드 만들기
 */

public class BubbleSort {

    public int Solution(int[] arr) { // 파라미터는 바디에서 또 선언될 수 없음
        int[] answer = {}; // 초기화
        // int i = 0; 변수를 초기화 했을 때 에러
        int i;
        for (i = 0; i <= arr.length; i++) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
            } else {
                return 0;
            }
        }
        return arr[i];
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.Solution(arr);

    }
}
