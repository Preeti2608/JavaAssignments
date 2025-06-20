// Inheritance in Java means one class can acquire the properties and methods of another class. This helps in reusing code and building relationships between classes.
// types
// SingleInheritance
// MultilevelInheritance
// MultipleInheritance
// HierarchicalInheritance
// Hybrid 

// Parent class
class Person {
    void displayDetails() {
        System.out.println("\nName: Preeti");
        System.out.println("Age: 18");
    }
}

// Child class
class Student extends Person {
    void displayCollege() {
        System.out.println("College: MIT Academy of Engineering");
    }
}

// Class with the main() method
public class TestInheritance {
    public static void main(String[] args) {
        Student s = new Student();      // Creating object of Student
        s.displayDetails();             // Calling method from Person class
        s.displayCollege();             // Calling method from Student class
    }
}
