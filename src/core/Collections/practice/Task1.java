package core.Collections.practice;

import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> cars = new HashMap<>();
        for(int i = 0; i < 5; i++) {
            String name = in.next();
            Integer price = in.nextInt();

            cars.put(name, price);
        }

        for(HashMap.Entry<String, Integer> car : cars.entrySet()) {
            System.out.println(car.getKey() + " costs " + car.getValue() + " USD");
        }
    }
}
