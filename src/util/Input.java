package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner;
    public Input(){
        this.scanner = new Scanner(System.in);
    }
    String getString() {
        return this.scanner.nextLine();
    }
    boolean yesNo(){
        String userBool = this.scanner.next();
        return userBool.equalsIgnoreCase("y") || userBool.equalsIgnoreCase("yes");
    }
    int getInt() {
        return this.scanner.nextInt();
    }
    int getInt(int min, int max) {
        int userNum;
        do {
            System.out.printf("Please enter a number between %d and %d: %n", min, max);
            userNum = this.scanner.nextInt();
        } while (userNum < min || userNum > max);
        return userNum;
    }
    double getDouble(){
        return this.scanner.nextDouble();
    }

    double getDouble(double min, double max){
        double userDub;
        do {
            System.out.printf("Please enter a decimal number between %f and %f: %n", min, max);
            userDub = this.scanner.nextDouble();
        } while (userDub < min || userDub > max);
        return userDub;
    }
}
