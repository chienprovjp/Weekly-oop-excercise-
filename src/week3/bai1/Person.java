package week3.bai1;

public class Person {
    protected String name;
    protected String dob;

    public Person() {
        System.out.println("1. Person is created");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("1. Person is created");
    }
}
