import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0 & i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 & i % 3 != 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else
            System.out.println(i);
        }
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Please enter an integer to see its squared and cubed values");
        int userNum = scannerObj.nextInt();
        String userRes = scannerObj.next();
        System.out.printf("You chose the number %d.  Here is your table:%n", userNum);
        System.out.println("number  | squared  | cubed");
        System.out.println("------  | -------  | -----");
        for(int i = 1; i <= userNum; i++){
            System.out.format(i + "      | " + i * i + "         | " + i * i * i +"%n");

        }
        System.out.println("Please enter a numerical grade from 1 to 100");
        int userGrade = scannerObj.nextInt();
        String userResponse = scannerObj.next();
        System.out.printf("You entered %d.  The corresponding letter grade is as follows:  ", userGrade);
        if(95 <= userGrade <= 100) {
            System.out.println("A+");
        } else if (88 <= userGrade <= 94) {
            System.out.println("A-");
        } else if (84 <= userGrade <= 87) {
            System.out.println("B+");
        } else if (80 <= userGrade <= 84) {
            System.out.println("B-");
        } else if (75 <= userGrade <= 79) {
            System.out.println("C+");
        } else if (70)
        }
    }

    }

