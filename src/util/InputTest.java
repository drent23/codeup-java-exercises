package util;

public class InputTest {
    public static void main (String[] args) {
        Input inputObj = new Input();
            String stringObj = inputObj.getString();
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

    }
}
