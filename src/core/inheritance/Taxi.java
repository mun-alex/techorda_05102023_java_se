package core.inheritance;

public class Taxi {
    private String model;
    private int year;
    private String color;

    protected static int carsCount;

    public Taxi() {
        System.out.println("Taxi");
    }

    public Taxi(String model) {
        this.model = model;
    }

    public Taxi(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice(int distance) {
        return distance * 100;
    }

    public static int getCarsCount() {
        return carsCount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
