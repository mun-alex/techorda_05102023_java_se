package core.lambda;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        Apple apple1 = new Apple("Green", 100.0);
        Apple apple2 = new Apple("Red", 100.0);
        Apple apple3 = new Apple("Green", 100.0);

        List<Apple> list = new ArrayList<>();
        list.add(apple1);
        list.add(apple2);
        list.add(apple3);

//        List<Apple> redApples = filterRedApple(list, new SortRedApples());
//        for (Apple apple : redApples) {
//            System.out.println(apple);
//        }

        List<Apple> greenApples = filterApple(list, apple -> apple.getColor().equals("Green"));
        List<Apple> heavyApples = filterApple(list, apple -> apple.getWeight() > 100);

        MathInterface result = (a, b) -> a + b;

    }

//    public static List<Apple> filterGreenApple(List<Apple> apples) {
//        List<Apple> result = new ArrayList<>();
//        for(Apple apple : apples) {
//            if (apple.getColor().equals("Green")) {
//                result.add(apple);
//            }
//        }
//        return result;
//    }
//
//    public static List<Apple> filterRedApple(List<Apple> apples) {
//        List<Apple> result = new ArrayList<>();
//        for(Apple apple : apples) {
//            if (apple.getColor().equals("Red")) {
//                result.add(apple);
//            }
//        }
//        return result;
//    }
//
//    public static List<Apple> filterColorApple(List<Apple> apples, String color) {
//        List<Apple> result = new ArrayList<>();
//        for(Apple apple : apples) {
//            if (apple.getColor().equals(color)) {
//                result.add(apple);
//            }
//        }
//        return result;
//    }
//
//    public static List<Apple> filterRedApple(List<Apple> apples, SortRedApples sort) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : apples) {
//            if (sort.test(apple)) {
//                result.add(apple);
//            }
//        }
//        return result;
//    }
//
//    public static List<Apple> filterLightApple(List<Apple> apples, SortLightApples sort) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : apples) {
//            if (sort.test(apple)) {
//                result.add(apple);
//            }
//        }
//        return result;
//    }

    public static List<Apple> filterApple(List<Apple> apples, ApplePredicate sort) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (sort.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
