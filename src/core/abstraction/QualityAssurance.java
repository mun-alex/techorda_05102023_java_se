package core.abstraction;

public class QualityAssurance extends ITEmployee {
    public QualityAssurance() {
    }

    public QualityAssurance(String name, int age) {
        super(name, age);
    }

    @Override
    public void doWork() {
        System.out.println("QA tests our application");
    }
}
