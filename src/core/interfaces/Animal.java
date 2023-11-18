package core.interfaces;

public class Animal implements Action {
    private String type;
    private int weight;

    public Animal() {
    }

    public Animal(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void jump() {
        System.out.println(type + " прыгает");
    }

    @Override
    public void sleep() {
        System.out.println(type + " спит");
    }
}
