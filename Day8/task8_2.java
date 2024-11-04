/*Найдите среди чисел от 50 до 70 второе простое число и завершить цикл с использованием break.*/
public class task8_2 {
    public static void main(String[] args) {
        int startNum = 50;
        int endNum = 70;
        int secondPrime = 0;
        int count = 0;
        for (int num = startNum; num < endNum; num++) {
            boolean isComposite = false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isComposite = true;
                    break;
                }
            }
            if (!isComposite) {
                count++;
                if (count == 2) {
                    secondPrime = num;
                    break;
                }
            }
        }
        System.out.println(secondPrime);
    }
}
