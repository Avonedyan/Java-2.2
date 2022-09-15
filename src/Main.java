public class Main {
    public static void main(String[] args) {
        int startSum = 50; // начальный счет
        int refill = 300; // сумма пополнения
        int gift = 1; // бонусная сумма за каждые 100 рублей пополнения
        int bonus;

        if (refill > 100) {
            bonus = refill / 100 * gift;
        }  else {
            bonus = 0;
        }
        System.out.println("Количество бонусных рублей:" + bonus);
        System.out.println("Итоговый счет:" + (startSum + bonus + refill));

    }
}
