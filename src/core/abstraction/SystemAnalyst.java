package core.abstraction;

public class SystemAnalyst extends ITEmployee {

    public SystemAnalyst() {
    }

    public SystemAnalyst(String name, int age) {
        super(name, age);
    }

    @Override
    public void doWork() {
        System.out.println("SA analises tasks");
    }
}
