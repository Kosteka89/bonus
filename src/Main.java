public class Main {
    public static void main(String[] args) {
        //Пример 1: поплнение 200 руб (бонуса нет)
        int balance = 100;
        int deposite = 200;

        int bonus = 0;
        if (deposite > 1000) {
            bonus = deposite / 100;
        }
        int finalBalance = balance + deposite + bonus;

        System.out.println("Пример 1: ");
        System.out.println("Итоговый счёт: " + finalBalance + "Рублей");
        System.out.println("Бонусные рубли " + bonus + "Рублей");
        System.out.println();

        //Пример 2: пополнение более 1000 руб (+бонус)
        int balance2 = 100;
        int deposite2 = 1500;

        int bonus2 = 0;
        if (deposite2 > 1000) {
            bonus2 = deposite2 / 100;
        }
        int finalBalance2 = balance2 + deposite2 + bonus2;

        System.out.println("Пример 2: ");
        System.out.println("Итоговый счёт: " + finalBalance2 + "Рублей");
        System.out.println("Бонусные рубли " + bonus2 + "Рублей");
    }
}