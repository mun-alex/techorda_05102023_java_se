package start;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

        //объявляем переменные
        int a = 10;
        int b = 15;

        //объявляем массив длиной 2 элемента типа int
        int[] array = new int[2];

        //кладем значения в массив
        array[0] = a;
        array[1] = b;

        //длина массива
        int arrayLength = array.length;
        System.out.println("arrayLength = " + arrayLength);

        //распечатываем массив поэлементно
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }

        String[] days = new String[]{"MON", "THU", "WED", "TH", "FR", "SAT", "SUN"};
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        Scanner scanner = new Scanner(System.in);
        String[] actors = new String[5];



        //наполняем массив через консоль
        for (int i = 0; i < actors.length; i++) {
            actors[i] = scanner.next();
            int adf = 34;
        }

        for (int i = 0; i < actors.length; i++) {
            System.out.println(actors[i]);
            int adf = 45;
        }


        int[] num = new int[]{3,4,67,8,98};
        //index 0 - 3
        //index 2 - 67
        System.out.println(num[2]);

        //i = i + 1
        //i++

        //sum = sum + a
        //sum += a
    }

}
