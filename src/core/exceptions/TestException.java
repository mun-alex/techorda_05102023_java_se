package core.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {

        //unchecked exceptions
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number");
            int a = scanner.nextInt();
            if (a == -1) {
                break;
            }

            try {
                System.out.println(100 / a);
            } catch (ArithmeticException e) {
                System.out.println("divide by zero");
            }
        }

        //unchecked exceptions
        String[] strings = {"5", "R", "0"};
        int a = 0;
        for (int i = 0; i < strings.length; i++) {
            try {
                a = 100 / Integer.parseInt(strings[i]);
            } catch (NumberFormatException e) {
                System.out.println("Number format exception");
                ;
            } catch (ArithmeticException e) {
                throw new RuntimeException();
            } finally {
                System.out.println("finally!");
            }
        }
        System.out.println(a);

        //checked exception
        try {
            readFile("file1.txt");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException, IOException {
        Reader reader = new FileReader(fileName);
        int c;
        while ((c = reader.read()) != -1) {
            System.out.println(c);
        }
    }
}
