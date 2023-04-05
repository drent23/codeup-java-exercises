package grades;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap <String, Student> students = new HashMap<>();
        Student minh = new Student("Minh");
        Student tamica = new Student("Tamica");
        Student travis = new Student("Travis");
        Student zakeria = new Student("Zakeria");
        minh.addGrade(90);
        minh.addGrade(100);
        minh.addGrade(95);
        students.put("nahMinh", minh);
        tamica.addGrade(98);
        tamica.addGrade(97);
        tamica.addGrade(99);
        students.put("t@m!k@", tamica);
        travis.addGrade(100);
        travis.addGrade(100);
        travis.addGrade(81);
        students.put("travisGHub", travis);
        zakeria.addGrade(94);
        zakeria.addGrade(97);
        zakeria.addGrade(91);
        students.put("zak3r1a", zakeria);
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("The Azeban cohort's top 4 students' GitHub usernames are as follows:%n");
            for (String gitUn : students.keySet()) {
                System.out.print("| " + gitUn + " |%n");
            }
            System.out.println("For which student would you like more information?");
            String userInput = scanner.nextLine();
            if (students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.println("Name - " + student.getName() + " Grades: " + student.getGrades() + " Grade Avg: " + student.getGradeAverage());
            } else {
                System.out.println("Sorry, there are no students with that name.  Please try another name.");
            }
            System.out.println("Would you like to view another student's record?");
            String userRecord = scanner.nextLine();
            if (!userRecord.equalsIgnoreCase("y")) {
                keepGoing = false;
            }
        }
    }
}
