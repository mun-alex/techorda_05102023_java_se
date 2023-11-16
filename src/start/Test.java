package start;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
//        int mod = year%4;
//        int mod1 = year%100;
//        int mod2 = year%400;
//
//        if ((mod == 0 && mod1 != 0) || mod2 == 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

//        double x = 123.4;
//        float y = (float) x;
//
//        double a = 5.2;
//        double b = -2.3;
//        float c = 5.2f;
//        float d = -2.3f;
//        System.out.println(a * b);
//        System.out.println((float)(a * b));
//        System.out.println(c * d);
//
//
//        double ab = 1.52;
//        int cd = 2;
//        System.out.println((int)(ab * cd));
//
//        String str1 = "hello";
//        String str2 = "bye";
//        System.out.print(str1 + " ");
//        System.out.print(str2);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("for-i");
//            for (int j = 0; j < 10; j++) {
//                System.out.println("for - j");
//            }
//        }
//
//        int[] array = new int[5];
//        int maxIndex = 1;
//        int minIndex = 4;
//
//        int temp = array[maxIndex];
//        array[maxIndex] = array[minIndex];
//        array[minIndex] = temp;

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] nums = new int[n];
//        int min = 0;
//        for (int i = 0; i < n; i++) {
//            int m = in.nextInt();
//            nums[i] = m;
//            if (i == 0) {
//                min = nums[i];
//            }
//            if (nums[i] < min) {
//                min = nums[i];
//            }
//        }
//        System.out.println(min * min);
//
//        String str = "";
//        int a = 0;
//
//        int x = 0;
//
//        if (a > 0) {
//            str = "Hello";
//            x = 15;
//        }
//
//        System.out.println(str);
//        System.out.println(x);
        //count = 1
        //121 / 10 count++ = 2
        //12 / 10 count =3
        //1
        //23455432
        //5467645


        //int min = array[0][j];
        //int max = array[n][j];
        //array[0][j] = max;
        //array[n][j] = min;


//        int[][] array = {{2,3}, {5,6}};
//
//        for(int i = 0; i < array.length; i++) {
//            for(int j = 0; j < array[i].length; j++) {
//                int min = array[0][j];
//                int max = array[array[i].length - 1][j];
//
//                array[0][j] = max;
//                array[array[i].length - 1][j] = min;
//            }
//            if (array.length == 2) break;
//        }
//
//        for(int i = 0; i < array.length; i++) {
//            for(int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        char ch = scanner.next().charAt(0);

        String str = "Bobby";
        CharSequence cs = "b";
        System.out.println(str.contains(cs));
    }
}
