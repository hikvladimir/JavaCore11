/*Вычислить факториал целых чисел от 1 до 10 с помощью цикла while*/
public class task6_2 {
    public static void main(String[] args) {
        int i=1;
        int n=1;
        while (i<=10) {
            n = i * n;
            System.out.println(i + "!=" + n);
            i++;
        }
    }
}
