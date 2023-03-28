import java.util.Scanner;

public class Bob {
    public static void main(String [] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Hello, I'm Bob.  Feel free to communicate with me however you'd like");
        String userRes = scannerObj.nextLine();
        if(userRes.endsWith("?")) {
                System.out.println("Sure");
            } else if(userRes.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if(userRes == "") {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
    }
}
