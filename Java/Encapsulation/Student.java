package Encapsulation;

// Encapsulation Example in Java

public class Student {
    // Step 1: Private data members
    private String name;
    private int age;

    // Step 2: Public getter method for name
    public String getName() {
        return name;
    }

    // Step 3: Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

// Main class to test the Student class
class Main {
    public static void main(String[] args) {
        Student s = new Student(); // Creating object of Student

        s.setName("Harshada"); // Setting name using setter
        s.setAge(20); // Setting age using setter

        // Getting values using getter
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}
