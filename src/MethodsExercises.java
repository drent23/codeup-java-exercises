import java.util.Scanner;

public class MethodsExercises {
    public static int addition(int x, int y) {
        return x + y;
    }
    public static int subtraction(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
    public static int divide(int x, int y) {
        return x / y;
    }
    public static int modulus(int x, int y) {
        return x % y;
    }
    public static int getNum(int x, int y) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d%n", x, y);
        int userNum = scannerObj.nextInt();
        if (userNum < x || userNum > y) {
            System.out.println("Invalid entry.  Please try again");
            getNum(x, y);
        }
            return userNum;
    }
    public static void getFactors() {
        Scanner scannerObj = new Scanner(System.in);
        String keepGoing;
        do {
            System.out.println("PLease enter a number between 1 & 10 - ");
            int userFact = getNum(1,10);
            long result = 1;
            System.out.println(userFact + "! = ");
            for (int i = 1; i <= userFact; i++) {
                    result *= i;
                    if(i == userFact) {
                        System.out.printf("%d = ", i);
                    } else {
                        System.out.printf("%d x ", i);
                    }
            }
            System.out.println(result);
            System.out.println("Would you like to continue? Please enter 'yes' or 'no'");
            keepGoing = scannerObj.next();
        } while (keepGoing.equalsIgnoreCase("yes"));
    }
    public static void shootCraps() {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Please enter the number of sides for your dice");
        int sidesNum = scannerObject.nextInt();
        int shotOne = (int) (Math.random() * sidesNum) + 1;
        int shotTwo = (int) (Math.random() * sidesNum) + 1;
        System.out.printf("You landed %d on your first roll and %d on your second", shotOne, shotTwo);
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
        getFactors();

        shootCraps();
    }

}
