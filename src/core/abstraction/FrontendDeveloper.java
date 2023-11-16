package core.abstraction;

public class FrontendDeveloper extends ITEmployee {
    public FrontendDeveloper() {
    }

    public FrontendDeveloper(String name, int age) {
        super(name, age);
    }

    @Override
    public void doWork() {
        System.out.println("Frontend developer does frontend");
    }
}
