package Zad4;

public class Employee {

    String firstName;
    String lastName;
    int yearOfBorn;
    int seniority;

    public Employee(String firstName, String lastName, int yearOfBorn, int seniority) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBorn = yearOfBorn;
        this.seniority = seniority;
    }

    void show() {
        System.out.println(firstName + " " + lastName + " " + yearOfBorn + " " + seniority);
    }

}
