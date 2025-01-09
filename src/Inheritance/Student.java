package Inheritance;

public class Student {
    public String name;

    Student() {
        this.name = "Stranger";
    }
    Student(String name){
        this.name = name;
    }
    public void displayName() {
        System.out.println("Hi my name is "+ name);
    }
}
