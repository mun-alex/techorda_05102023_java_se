package core.classes;

public class BankAccountTest {
    public static void main(String[] args) {

        //создаем новый счет
//        BankAccount account1 = new BankAccount();
//        account1.iban = "KZ12323243445456424234234242424424";
//        account1.balance = -2000000;

        //создаем новый счет
//        BankAccount account2 = new BankAccount();
//        account2.iban = "KZ435743243445456";
//        account2.balance = 1000000000;

        //создаем нового клиента и привязываем к нему счет
//        BankClient assyl = new BankClient();
//        assyl.name = "Assyl";
//        assyl.iin = "325684564223";
//        assyl.age = 18;
//        assyl.account = account1;
//        System.out.println(assyl);

        //создаем нового клиента и привязываем к нему счет
//        BankClient baglan = new BankClient();
//        baglan.name = "Baglan";
//        baglan.iin = "347382994284";
//        baglan.age = 19;
//        baglan.account = account2;
//
//        System.out.println("У Баглана столько денег = " + baglan.account.getBalance());
//
//        createNewClient("Baglan", "347382994284", 19, account2);
//
//        BankClient kulyash = new BankClient("Kulyash");
//
//        BankClient[] clients = new BankClient[3];
//        clients[0] = assyl;
//        clients[1] = baglan;

        BankAccount account3 = new BankAccount();
        account3.setIban("KZ384738478347387483");
        System.out.println(account3);
        System.out.println(account3.getIban());

        account3.deposit(40000);
//        account3.iban = null;
    }


    public static void createNewClient(String name, String iin, int age, BankAccount account) {
        BankClient client = new BankClient();
        client.name = name;
        client.iin = iin;
        client.age = age;
        client.account = account;
    }
}
