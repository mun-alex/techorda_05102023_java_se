package core.abstraction;

public class BackendDeveloper extends ITEmployee {
    public BackendDeveloper() {
    }

    public BackendDeveloper(String name, int age) {
        super(name, age);
    }

    @Override
    public void doWork() {
        System.out.println("Backend developer works in java");
    }
}
