package start;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {

//        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
//
//        for(int i = 0; i < matrix.length; i++) {
//            for(int j = 0; j < matrix.length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

//        Scanner scanner = new Scanner(System.in);
//        int[][] matrix2 = new int[2][2];
//
//        for(int i = 0; i < matrix2.length; i++) {
//            for (int j = 0; j < matrix2.length; j++) {
//                matrix2[i][j] = scanner.nextInt();
//            }
//        }
//
//        for(int i = 0; i < matrix2.length; i++) {
//            for(int j = 0; j < matrix2.length; j++) {
//                System.out.print(matrix2[i][j] + " ");
//            }
//            System.out.println();
//        }

        Scanner name = new Scanner(System.in);
        String[][] names = new String[3][5];

        System.out.println(names.length);

        for(int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                names[i][j] = name.next();
            }
        }

        for(int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }
    }
}
