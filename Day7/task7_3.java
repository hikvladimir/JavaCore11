import java.util.Arrays;
import java.util.Random;

/*Создайте переменную для массива из 10 элементов.
 * Заполните его произвольными значениями целочисленного типа.
 Найдите максимальный элемент и выведите его индекс. */
public class task7_3 {
    public static void main(String[] args) {
        Random random = new Random();

        int arr[] = new int[10];
        int max = 0;
        int counter = 0;


        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(200);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 10; i++) {
            if (arr[i] > max) {
                max = arr[i];
                counter = i;
            }

        }
        System.out.println(counter);
    }
}
