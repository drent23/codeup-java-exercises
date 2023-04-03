import java.util.Scanner;
public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    };
    public String getName(){
        //TODO return person's name
        return this.name;
    }
    public void setName(String name){
        //TODO change name field to passed val
        this.name = name;
    }
    public void sayHello(){
        //TODO print message to console w/ person's name
        System.out.println("Hello, I'm " + this.name + ".  Nice to meet you!");
    }
//    public static void main(String[] args){
//        Person firstPerson = new Person("Tamica");
//        firstPerson.setName("Travis");
//        System.out.println(firstPerson.getName());
//        firstPerson.sayHello();
        //first 'expectation' example

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        //second 'expectation' example

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        //third 'expectation' example

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }

