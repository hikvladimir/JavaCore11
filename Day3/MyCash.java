/*Написать программ, которая советует вам, что
* купить в зависимости количества денег в вашем
* кармане. Например: если у вас большещ 500
* рублей, то программа выводит "Пицца",э если
* меньше 100 рублей, то "Доширак".*/
public class MyCash {
    public static void main(String[] args) {
        int myWallet=90;
        if (myWallet<100) {
            System.out.println("Доширак");
        }else if (myWallet>500){
            System.out.println("Пицца");
        }
    }
}
