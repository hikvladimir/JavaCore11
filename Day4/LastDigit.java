import java.util.Scanner;

/*Написать метод getLastDigit(), который принимает на вход число, а
возвращает последнюю цифру этого числа.*/
public class LastDigit {
    public static int getLastDigit(int i) {
        return i%10;
    }

    public static void main(String[] args) {
        Scanner nc=new Scanner(System.in);
        int nomber=nc.nextInt();
        System.out.println(getLastDigit(nomber));
    }
}
