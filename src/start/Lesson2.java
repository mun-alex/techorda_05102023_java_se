package start;

import java.util.Scanner;

public class Lesson2 {

//    private String str;


    public static void main(String[] args) {
//        boolean isRainy = false;

//        if (isRainy) {
//            System.out.println("Возьми зонт!");
//        }
//        System.out.println("Ничего не произошло!");


//        int temperature = 10;
//        // <, >, ==, <=, >=, !=
//        if (temperature < 0) {
//            System.out.println("Одень шапку");
//        }

        // &, |
//        if (temperature < 0 && isRainy) {
//            System.out.println("Одень шапку");
//            System.out.println("Возьми зонт!");
//        }

//        if (temperature < 0 || isRainy) {
//            System.out.println("Одень шапку");
//            System.out.println("Возьми зонт!");
//        } else {
//            System.out.println("Хорошая, погода!");
//        }

//        boolean is18 = true;
//        boolean haveHighEdu = true;
//        boolean isTechEdu = false;
//        boolean isEconomEdu = true;

//        if (is18) {
//            if (haveHighEdu) {
//                if (isTechEdu) {
//                    System.out.println("Можешь работать в IT");
//                } else if (isEconomEdu) {
//                    System.out.println("Можешь работать бухгалтером");
//                }
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        double x = scanner.nextDouble();
//
//        double z = x % 17;
//
//        if (z == 0) {
//            System.out.println("DIVISIVLE BY 17");
//        }

//        Scanner scanner1 = new Scanner(System.in);
//        int monthNumber = scanner1.nextInt();
//        String monthNumber = scanner1.next();
//        if (monthNumber == 1) {
//            System.out.println("January");
//        } else if (monthNumber == 2) {
//            System.out.println("February");
//        } else if (monthNumber == 3) {
//            System.out.println("March");
//        } else {
//            System.out.println("Wrong number");
//        }

//        switch (monthNumber) {
//            case "1":
//                System.out.println("Январь");
//                break;
//            case "2":
//                System.out.println("Февраль");
//                break;
//            case "3":
//                System.out.println("Март");
//                break;
//            default:
//                System.out.println("Нет такого месяца");
//        }

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();


//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//
//        if (a == 8
//                && b == 7
//                && (c == 0 || c == 7)
//                && (d == 1 || d == 0 || d == 5 || d == 7)) {
//            System.out.print("YES");
//        } else {
//            System.out.print("NO");
//        }

        if (x - x1 == y - y1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
