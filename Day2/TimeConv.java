/*Создать новый класс, в котором вы
* вводите количество секунд, а программа
* выводит в консоль, сколько это дней, часов,
* минут и секунд*/
public class TimeConv {
    public static void main(String[] args) {
        int time=5000;
        int sec=time%60;
        int min=time/60;
        int hour=min/60;
        int day=hour/24;
        System.out.println("Количество секунд: "+sec);
        System.out.println("Количество минут: "+min);
        System.out.println("Количество часов: "+hour);
        System.out.println("Количество дней: "+day);

    }
}
