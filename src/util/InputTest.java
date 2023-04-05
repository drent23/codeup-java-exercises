package util;

public class InputTest {
    public static void main (String[] args) {
        Input inputObj = new Input();
            System.out.println("Please type a string");
            String stringObj = inputObj.getString();
            System.out.println("stringObj = " + stringObj);
            System.out.println(stringObj);
            System.out.println("Is coding fun?");
            boolean codingFun = inputObj.yesNo();
            System.out.println(codingFun);
            System.out.println("Please enter a number: ");
            int userInt = inputObj.getInt();
            System.out.println(userInt);
            int diffInt = inputObj.getInt(50,100);
            System.out.println(diffInt);
            System.out.println("Please enter a decimal number: ");
            double diffDub = inputObj.getDouble();
            System.out.println(diffDub);
            String promptStr = inputObj.getString("Please enter another string.");
            System.out.println(promptStr);
            boolean keepGoing = inputObj.yesNo("Want to continue?");
            System.out.println(keepGoing);
            int thirdInt = inputObj.getInt("Please enter another number.");
            System.out.println(thirdInt);
            double thirdDub = inputObj.getDouble("Please enter a decimal number.");
            System.out.println(thirdDub);
            double fourthDub = inputObj.getDouble(1,10, "Please enter a decimal number between 1 and 10.");
            System.out.println(fourthDub);


    }
}
