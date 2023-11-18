package core.interfaces;

public class Person implements Action {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }

    @Override
    public void sleep() {
        System.out.println("Человек спит");
    }
}
