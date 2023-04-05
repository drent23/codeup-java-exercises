package grades;

import java.util.ArrayList;
public class Student {
    private String name;
    private ArrayList<Integer> grades;
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }
    // returns the student's name
    public String getName() {
        return name;
    }
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        if (grades.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

}
