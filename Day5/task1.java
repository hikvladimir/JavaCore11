/*Создайте метод с одним целоцисленым параметрои. Метод должен
* определить, является ли последняя цифра семеркой и вернуть boolean значение.*/
import java.util.Scanner;

public class task1 {
    public static boolean isASeven(int n){
        if ((n%10)==7) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner nc=new Scanner(System.in);
        int nomber=nc.nextInt();
        System.out.println(isASeven(nomber));
    }
}
