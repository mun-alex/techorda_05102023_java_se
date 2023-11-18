package core.interfaces;

public class Test {
    public static void main(String[] args) {
        Action serik = new Person("Серик", 18);
        Action tiger = new Animal("Тигр", 150);

        Action[] actions = {serik, tiger};

        for (Action action : actions) {
            MyClass.doAction(action);
        }
    }
}
