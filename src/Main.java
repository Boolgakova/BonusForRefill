public class Main {
    public static void main(String[] args) {
        int balance = 500; //изначальный баланс счёта
        int refill = 1100; //сумма пополнения
        int bonus; //бонусные баллы
        int amount; //итоговая сумма на счёте

        if (refill >= 1000) {
            bonus = refill / 100;
            amount = balance + refill + bonus;
            System.out.println("Ваш бонус составил " + bonus + " баллов");
            System.out.println("Баланс Вашего счета " + amount + " рублей");
        } else {
            amount = balance + refill;
            System.out.println("Баланс Вашего счета " + amount + " рублей");
            System.out.println("Чтобы получить бонус, пополните счёт на 1000 или более рублей");
        }
    }
}
