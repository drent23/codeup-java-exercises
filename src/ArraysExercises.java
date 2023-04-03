import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        String[] Person = new String[3];
        Person[0] = "Tabitha";
        Person[1] = "Samantha";
        Person[2] = "Bertha";
        for (String name : Person) {
            System.out.println("Hi!  My name is " + name);
        }
        Arrays.toString(addPerson())
    }
    static Person[] addPerson(Person[] addedPeople, Person addedPerson) {
        Person[] updatedArr = Arrays.copyOf(addedPeople, addedPeople.length + 1);
        updatedArr[updatedArr.length - 1] = addedPerson;
        return updatedArr;


    }
}


