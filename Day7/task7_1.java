/*Посчитай сумму цифр цисла 78938234445 с помощью цикла do while.*/
public class task7_1 {
    public static void main(String[] args) {
        long i=78938234445L;
        long n,g=0;
        do {
            n=i%10;
            g+=n;
            i=(i-n)/10;

        } while(i!=0);
        System.out.println(g);
    }

}
