package core.classes;

public class BankClient {
    String name;
    String iin;
    BankAccount account;
    int age;


    public BankClient() {


    }


    public BankClient(String name, String iin, int age, BankAccount account) {
        this.name = name;
        this.iin = iin;
        this.age = age;
        this.account = account;
    }


    public BankClient(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "BankClient{" +
                "name='" + name + '\'' +
                ", iin='" + iin + '\'' +
                ", account=" + account +
                ", age=" + age +
                '}';
    }

}
