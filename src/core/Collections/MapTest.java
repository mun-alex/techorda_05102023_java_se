package core.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(6, "six");
        numbers.put(6, "Шесть");

        System.out.println(numbers);

        System.out.println(numbers.get(6));

        for (Map.Entry<Integer, String> number : numbers.entrySet()) {
            if (number.getKey() == 6) {
                System.out.println(number.getValue());
            }
        }

        List<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");

        Map<String, List<String>> map = new HashMap<>();
        map.put("Months", months);
    }
}
