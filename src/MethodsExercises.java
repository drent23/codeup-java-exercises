import java.util.Scanner;

public class MethodsExercises {
    public static int addition(int x, int y) {
        int result = x + y;
        return result;
    }
    public static int subtraction(int x, int y) {
        int result = x - y;
        return result;
    }
    public static int multiply(int x, int y) {
        int result = x * y;
        return result;
    }
    public static int divide(int x, int y) {
        int result = x / y;
        return result;
    }
    public static int modulus(int x, int y) {
        int result = x % y;
        return result;
    }
    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }
    public static void main(String[] args) {
        System.out.println(addition(4, 7));
        System.out.println(subtraction(20, 5));
        System.out.println(multiply(10, 10));
        System.out.println(divide(63, 9));
//        System.out.println(divide(63, 0));
        System.out.println(modulus(10, 3));
    }

}
