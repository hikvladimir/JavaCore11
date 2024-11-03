import java.util.Random;
/*Создайте переменную для массива из 10 элементов.
* Заполните его произвольными значениями целочисленного типа.
* Выведите на экран элименты, стоящие на четных позициях.*/
public class task7_2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }

        }
    }
}
