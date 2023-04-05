package shapes;
import java.util.Arrays;
import java.util.Scanner;
import util.Input;
public class CircleApp {
    private static int userCircles;
    public static int getUserCircles(){
        return userCircles + 1;
    }
    public static void main(String[] args) {
        Input inputObj = new Input();
        do {
            System.out.println("Please enter the radius of your circle");
            double radius = inputObj.getDouble();
            Circle circle = new Circle(radius);
            userCircles = getUserCircles();
            double circumference = circle.getCircumference();
            double area = circle.getArea();
            System.out.printf("The radius is %f%n", radius);
            System.out.printf("The circle's circumference is %f and the area is %f%n", circumference, area);
            System.out.println("Would you like to continue?");
        } while {inputObj.yesNo()};
        System.out.printf("There are a total of %d circles.%n", userCircles);
    }
}
