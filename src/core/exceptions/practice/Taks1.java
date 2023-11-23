package core.exceptions.practice;

import java.util.*;

public class Taks1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter array length");
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println("enter number");
                array[i] = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException");
                in.next();
                array[i] = 0;
            }
        }
    }
}
