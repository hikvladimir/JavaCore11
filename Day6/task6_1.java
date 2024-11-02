import java.util.Scanner;

public class task6_1 {
    public static void dayWeek(int i){
        switch (i) {
            case 1:
                System.out.println("Понедельник");
            break;
            case 2:
                System.out.println("Вторник");
            break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Дня с таким номером не существует");

        }
    }

    public static void main(String[] args) {
        Scanner nc=new Scanner(System.in);
        System.out.println("Введите порядковый номер дня недели: ");
        int nomber=nc.nextInt();
        dayWeek(nomber);
    }
}

