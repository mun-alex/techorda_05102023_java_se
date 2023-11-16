package start;

import java.util.Scanner;

public class MArrayPractice {
    public static void main(String[] args) {
        task4();
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        //2 X 3
        // 2 5 6
        // 7 3 2


        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();

                //array[1][0] = scanner.nextInt();
                //array[1][1] = scanner.nextInt();
                //array[1][2] = scanner.nextInt();
            }
        }

        for(int i = 0; i < array.length; i+=2) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);

                //System.out.print(array[0][0]);
                //System.out.print(array[0][1]);
                //System.out.print(array[0][2]);
            }
            System.out.println();
        }
    }
}
