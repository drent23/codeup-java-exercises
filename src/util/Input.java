package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner;
    public Input(){
        this.scanner = new Scanner(System.in);
    }
    public getString() {
        return this.scanner.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }
    public boolean yesNo(){
        String userBool = this.scanner.next();
        return userBool.equalsIgnoreCase("y") || userBool.equalsIgnoreCase("yes");
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();
    }
    public getInt() {
        return this.scanner.nextInt();
    }
    public int getInt(String prompt){
        System.out.println(prompt);
        return getInt();
    }
    public getInt(int min, int max) {
        int userNum;
        do {
            System.out.printf("Please enter a number between %d and %d: %n", min, max);
            userNum = this.scanner.nextInt();
        } while (userNum < min || userNum > max);
        return userNum;
    }
    public getInt(int min, int max, String prompt) {
        int userNum;
        do {
            System.out.println(prompt);
            userNum = this.scanner.nextInt();
        } while (userNum < min || userNum > max);
        return userNum;
    }
    public double getDouble () {
        return this.scanner.nextDouble();
    }
    public double getDouble (String prompt){
        System.out.println(prompt);
        return getDouble();
    }
    public double getDouble (double min, double max){
        double userDub;
        do {
            System.out.printf("Please enter a decimal number between %f and %f: %n", min, max);
            userDub = this.scanner.nextDouble();
        } while (userDub < min || userDub > max);
        return userDub;
    }
    public double getDouble ( double min, double max, String prompt){
        double userDub;
        do {
            System.out.println(prompt);
            userDub = this.scanner.nextDouble();
        } while (userDub < min || userDub > max);
        return userDub;
    }
}