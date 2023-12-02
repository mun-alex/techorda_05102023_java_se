package core.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
    public static void main(String[] args) {
        List<Dish> menu = new ArrayList<>();
        Dish dish1 = new Dish("Спагетти", 2000, true, "Europe");
        Dish dish2 = new Dish("Бризоль", 2500, false, "Europe");
        Dish dish3 = new Dish("Хачапури", 3000, true, "Asian");
        Dish dish4 = new Dish("Манты", 2800, false, "Asian");
        Dish dish5 = new Dish("Рамен", 1300, false, "Asian");

        menu.add(dish1);
        menu.add(dish2);
        menu.add(dish3);
        menu.add(dish4);
        menu.add(dish5);

        List<Dish> resultDish = new ArrayList<>();
        for(Dish dish : menu) {
            if (dish.getType().equals("Europe")) {
                resultDish.add(dish);
            }
        }

        List<Dish> europeDishes = menu.stream()
                .filter(dish -> dish.getType().equals("Europe"))
                .collect(Collectors.toList());

        List<String> vegetarianDishNames = menu.stream()
                .filter(dish -> dish.isVegetarian())
                .map(dish -> dish.getName())
                .collect(Collectors.toList());

//        vegetarianDishNames.stream().forEach(name -> System.out.println(name));

        List<String> limitDishes = menu.stream()
                .filter(dish -> dish.getCalories() >= 2000)
                .limit(3)
                .map(dish -> dish.getName())
                .collect(Collectors.toList());

        limitDishes.stream().forEach(name -> System.out.println(name));

        int[] numbers = {3, 8, 2, 4, 6, 9, 12, 15};
        IntStream numbersStream = IntStream.of(numbers);
    }
}
