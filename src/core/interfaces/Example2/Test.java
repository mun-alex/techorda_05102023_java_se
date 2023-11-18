package core.interfaces.Example2;

public class Test {
    public static void main(String[] args) {
        Algorithm1 algorithm1 = new Algorithm1();
        Algorithm2 algorithm2 = new Algorithm2();
        MyApp application = new MyApp();
        application.encodePassword(algorithm2);

        application.decodePassword(algorithm1);
    }
}
