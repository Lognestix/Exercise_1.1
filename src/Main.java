public class Main {
    public static void main(String[] args) {
        int currentBalance = 2_000_000_000; //Текущий баланс
        int transferAmount = 500_000_000; //Сумма перевода
        int totalBalance = currentBalance + transferAmount; //Итоговый баланс
        System.out.println(totalBalance);
    }
}
