package core.abstraction.practice;

public class Test {
    public static void main(String[] args) {
        ERPSystem erpSystem = new ERPSystem();
        erpSystem.addUser(new Student(1, "zhansaya@bk.ru", "qwerty","Zhansaya","Kulbaeva", "IT1-2015",4));
        erpSystem.printStudent();
    }
}
