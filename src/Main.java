public class Main {
    public static void main(String[] args) {
        int startsum = 50; // начальный счет
        int popolnenie = 300; // сумма пополнения
        int gift = 1; // бонусная сумма за каждые 100 рублей пополнения
        int bonus;

        if (popolnenie > 100) {
            bonus = popolnenie / 100 * gift;
        }  else {
            bonus = 0;
        }
        System.out.println("Количество бонусных рублей:" + bonus);
        System.out.println("Итоговый счет:" + (startsum + bonus + popolnenie));

    }
}
