import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
        Scanner scannerObj = new Scanner(System.in);
        System.out.printf("The value of pi is approximately %.2f%n", pi);


        System.out.println("Enter the highest score you've ever received on a test: ");
        int highScore = scannerObj.nextInt();
        scannerObj.nextLine();
        System.out.printf("Your highest score was %d%n", highScore);
        System.out.println("Please enter 3 words:");
        String firstWord = scannerObj.nextLine();
        String secondWord = scannerObj.nextLine();
        String thirdWord = scannerObj.nextLine();
        System.out.printf("Your three chosen words are: %n%s %n%s %n%s", firstWord, secondWord, thirdWord);
        scannerObj.nextLine();
        System.out.println("Please enter a sentence:");
//        String userSent = scannerObj.next();
        String userSent = scannerObj.nextLine();
        System.out.printf("Your sentence is: %s", userSent);
        scannerObj.nextLine();
        System.out.println("Please enter the length and width of your classroom.");
        float roomLength = scannerObj.nextFloat();
        float roomWidth = scannerObj.nextFloat();
        float roomHeight = scannerObj.nextFloat();
        System.out.printf("Your classroom area = %.2fft x %.2fft , or %.2fsq ft%n", roomLength, roomWidth, roomLength*roomWidth);
        System.out.printf("The perimeter of your classroom is %.2fft%n", (roomLength*2)+(roomWidth*2));
        System.out.printf("The volume of your classroom is %.2f cubic ft", roomLength*roomWidth*roomHeight);

    }
}
