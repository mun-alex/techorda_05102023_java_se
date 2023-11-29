package core.сollections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task12 {
    //    Создайте множество из чисел, куда мы вводим 5 элементов. После, нужно вывести сумму всех элементов в множестве.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numberSet = new HashSet<>();

        int input;
        do {
            input = scanner.nextInt();
            numberSet.add(input);
        } while (input != 0);

        System.out.println(numberSet);

        int sum = numberSet.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
