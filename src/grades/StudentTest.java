package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student davidR = new Student("DavidR");
        davidR.addGrade(100);
        davidR.addGrade(88);
        davidR.addGrade(92);
        System.out.println("Here is the avg grade for " + davidR.getName() + ": " + davidR.getGradeAverage());

        Student travisG = new Student("TravisG");
        travisG.addGrade(96);
        travisG.addGrade(100);
        travisG.addGrade(100);
        System.out.println("Travis' grades thus far are as follows: " + travisG.getGrades());
        System.out.println("Here is the avg grade for " + travisG.getName() + ": " + travisG.getGradeAverage());
    }

}
