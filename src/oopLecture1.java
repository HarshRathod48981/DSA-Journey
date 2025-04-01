//classes, objects, constructors, keywords

public class oopLecture1 {
    public static void main(String[] args) {
        student obj = new student();
        obj.displayDetails("harsh", 19, 12);
    }
}

//	1.	Create a class Student with properties name, age, and grade.
//	Write a method displayDetails() to print student details. Create an object and call the method.
class student {
    void displayDetails(String name, int age, int grade) {
        System.out.println("Name : " +name);
        System.out.println("age : " +age);
        System.out.println("grade : " +grade);
    }
}