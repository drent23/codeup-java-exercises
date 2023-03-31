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
    public int getInt() {
        return this.scanner.nextInt();
    }
    public int getInt(int min, int max) {
        int userNum;
        do {
            System.out.printf("Please enter a number between %d and %d: %n", min, max);
            userNum = this.scanner.nextInt();
        } while (userNum < min || userNum > max);
        return userNum;
    }
    public double getDouble(){
        return this.scanner.nextDouble();
    }

    public double getDouble(double min, double max){
        double userDub;
        do {
            System.out.printf("Please enter a decimal number between %f and %f: %n", min, max);
            userDub = this.scanner.nextInt();
        } while (userDub < min || userDub > max);
        return userDub;
    }
}
