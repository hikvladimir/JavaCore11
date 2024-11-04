import java.util.Arrays;
import java.util.Random;

public class max_task {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        // Заполнение массива случайными целыми числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // случайные числа от 0 до 99
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));

        int K = 1; // Пример сдвига на 1 элемента
        K = K % array.length; // Учитываем, что K может быть больше длины массива

        // Сдвиг массива на K элементов влево
        reverse(array, 0, K - 1);
        reverse(array, K, array.length - 1);
        reverse(array, 0, array.length - 1);

        System.out.println("Массив после сдвига на " + K + " элементов: " + Arrays.toString(array));
    }

    // Метод для реверсирования части массива
    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
