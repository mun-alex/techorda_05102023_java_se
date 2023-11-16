package start;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        task21();
    }

    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.trim();
        System.out.println("(" + str + ")");
    }

    public static void task21() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] strArray = str.split("");

        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }

    public static void task25() {
//        char ch = '<';
//        char ch2 = '>';
//        int a = ch;
//        int b = ch2;
//        System.out.println(ch);
//        System.out.println(ch2);
//        System.out.println(a);
//        System.out.println(b);

        //1. превращаем строку в массив символов
        //2. через цикл находим индексы символов < >
        //3. используя метод substring получим строку, которая нах-ся между найденными индексами

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
//        char[] strArray = str.toCharArray();
        int indexBegin = 0;
        int indexEnd = 0;

//        for (int i = 0; i < strArray.length; i++) {
//            if (strArray[i] == '<') {
//                indexBegin = i + 1;
//            }
//
//            if (strArray[i] == '>') {
//                indexEnd = i;
//            }
//        }
//
//        System.out.println(str.substring(indexBegin, indexEnd));
        //1.получим массив слов из строки по пробелам
        //2.через цикл берем слова, которые будут между скобками
        //3. собираем найденные слова в одну строку
        String[] strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals("<")) {
                System.out.print(strArray[i + 1] + " ");
            }
        }

    }

    public static void task27() {
        //1. убираем все пробелы из строки
        //2. создаем массив из символов строки
        //3. выявляем приоритет ариф действия
        //if ((1 = + или 1 = -) и (3 = * или 3 = /))


        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");

        int result = 0;

        int a = Integer.parseInt(strArray[0]);
        int b = Integer.parseInt(strArray[2]);
        int c = Integer.parseInt(strArray[4]);

        if ((strArray[1].equals("+") || strArray[1].equals("-")) &&
                (strArray[3].equals("*") || strArray[3].equals("/"))) {
            switch (strArray[3]) {
                case "*":
                    result = b * c;
                    break;
                case "/":
                    result = b / c;
                    break;
            }

            switch (strArray[1]) {
                case "+":
                    result += a;
                    break;
                case "-":
                    result -= a;
                    break;
            }
        } else {
            switch (strArray[1]) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
            }

            switch (strArray[3]) {
                case "+":
                    result += c;
                    break;
                case "-":
                    result -= c;
                    break;
                case "*":
                    result *= c;
                    break;
                case "/":
                    result /= c;
                    break;
            }
        }

        System.out.println(result);

    }
}
