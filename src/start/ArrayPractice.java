package start;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        task1();
        task12();
        task4();
        task29();
    }

    public static void task1() {
        int[] nums = new int[]{6,19,26,9,46,8,5,65,90,25};
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        System.out.println(nums[index]);
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }

    public static void task12() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        double sum = 0;
        int count = 0;

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
                count++;
            }
        }
        System.out.println(sum / count);
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.println(numbers[i]);
            }
        }
    }

    public static void task29() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                startIndex = i;
                break;
            }
        }

        for (int i = startIndex + 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                endIndex = i;
                break;
            }
        }

        int sum = 0;

        for (int i = startIndex; i < endIndex; i++) {
            sum += numbers[i];
        }

        System.out.println(sum);
    }

}
