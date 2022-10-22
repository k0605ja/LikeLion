package week5._22_10_18;

// n을 입력하면 n*n이 출력되도록 해라

public class Rectangle {
    int PrintStar(int x, int y) {

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return x;
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.PrintStar(5, 3);
    }
}
