package core.methods;

public class Methods {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(a + b);

        int c = 11;
        int d = 12;
        System.out.println(c + d);

        int e = 15;
        int f = 30;
        System.out.println(e + f);

        int result = 0;
        result = sum(5, 10);
        result = sum(11, 12);
        result = sum(34, 32);
        result = sum(3, 45, 56);
        System.out.println(result);

        System.out.println(stringNumber(2));
    }

    public static int sum(int a, int b) {
        System.out.println(a + b);
        int sum = a + b;
        return sum;
    }

    public static int sum(int a, int b, int c) {
        System.out.println(a + b + c);
        int sum = a + b + c;
        return sum;
    }

    public static int getMax(int a, int b, int c){
        int max = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        return max;
    }

    public static int getMax1(int a, int b, int c){
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static String stringNumber (int a) {
        switch (a) {
            case 1:
                return "One";
            case 2:
                return "Two";
            default:
                return "No such number";
        }
    }
}
