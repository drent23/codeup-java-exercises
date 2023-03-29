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
    public static int getNum(int x, int y) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter a number between " +x+ " & " +y);
        int userNum = scannerObj.nextInt();
        if (x <= userNum && userNum <= y) {
            System.out.printf("You entered %d, thanks for playing the game!", userNum);
        } else {
            System.out.println("You made an invalid entry.  Please reread the instructions and try again");
        }
        return userNum;
    }
    public static long getFactor() {
        Scanner scannerObj = new Scanner(System.in);
        char showGoesOn = scannerObj.next().charAt(0);
        do {
            System.out.println("PLease enter a number between 1 & 10 - ");
            int userFact = scannerObj.nextInt();
            if (userFact < 1 || userFact > 10) {
                System.out.println("You entry was invalid.  Please enter a number between 1 & 10.");
                continue;
            }
            long result = 1;
            for (int i = 1; i <= userFact; i++) {
                    result *= result * i;
            }
            System.out.printf("%d! = %d%n", userFact, result);
            System.out.println("Would you like to continue? Please enter \"y\" or \"n\".");
        } while (Character.toLowerCase(showGoesOn) == "y");
        return getFactor();
    }
    public static void main(String[] args) {
        System.out.println(addition(4, 7));
        System.out.println(subtraction(20, 5));
        System.out.println(multiply(10, 10));
        System.out.println(divide(63, 9));
//        System.out.println(divide(63, 0));
        System.out.println(modulus(10, 3));
        getNum(50,100);
        System.out.println();
        getFactor();
    }

}
