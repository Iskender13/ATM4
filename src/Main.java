public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000.0);
        System.out.println("Initial balance: " + account.getAmount());

        double withdrawalAmount = 6000.0;
        while (true) {
            try {
                account.withdraw(withdrawalAmount);
                System.out.println("Withdrawn: " + withdrawalAmount);
            } catch (LimitException e) {
                System.out.println("Remaining balance: " + e.getRemainingAmount());
                withdrawalAmount = e.getRemainingAmount(); // Устанавливаем оставшийся остаток
            }

            if (withdrawalAmount == 0.0) {
                break;
            }
        }
    }
}