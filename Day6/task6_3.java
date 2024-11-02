import java.util.Scanner;

public class task6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размеры прямоугольного отверстия a и b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Введите радиус картонки r: ");
        int r = sc.nextInt();
        System.out.println(isCover(a, b, r));
    }

    static boolean isCover(int a, int b, int r) {
        double d = Math.hypot(a, b);
        return d <= 2 * r;
    }
}
