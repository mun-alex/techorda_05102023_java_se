package core.abstraction;

public class ProjectManager extends ITEmployee {
    public ProjectManager() {
    }

    public ProjectManager(String name, int age) {
        super(name, age);
    }

    @Override
    public void doWork() {
        System.out.println("PM execute project");
    }
}
