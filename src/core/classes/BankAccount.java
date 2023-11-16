package core.classes;

public class BankAccount {
    private String iban;
    private int balance;

    public void setIban(String iban) {
        if (iban.length() == 20) {
            this.iban = iban;
        } else {
            System.out.println("ERROR");
        }
    }

    public String getIban() {
        return iban;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(int amount) {
        validation(amount);
        return getBalance() + amount;
    }

    private void validation(int amount) {
        System.out.println("Валидация клиента при пополнении депозита");
    }

    public String toString() {
        return "iban = " + iban + ", " + "balance = " + balance;
    }
}
