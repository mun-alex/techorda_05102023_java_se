package core.streams;

public class Dish {
    private String name;
    private int calories;
    private boolean isVegetarian;
    private String type;

    public Dish() {
    }

    public Dish(String name, int calories, boolean isVegetarian, String type) {
        this.name = name;
        this.calories = calories;
        this.isVegetarian = isVegetarian;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", isVegetarian=" + isVegetarian +
                ", type='" + type + '\'' +
                '}';
    }
}
