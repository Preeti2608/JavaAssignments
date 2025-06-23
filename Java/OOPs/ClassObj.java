package OOPs;

public class ClassObj {

    // Method 1
    public void display() {
        System.out.println("\nHello, this is a method in ClassObj.");
    }

    // Method 2
    public void show() {
        System.out.println("This is show method in ClassObj.");
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance (object) of ClassObj
        ClassObj obj = new ClassObj();

        // Call methods using the object
        obj.display();
        obj.show();
    }
}


// public class Student {

//     // Method to display student name
//     public void printName() {
//         System.out.println("Student Name: Preeti");
//     }

//     // Method to display student grade
//     public void printGrade() {
//         System.out.println("Grade: A+");
//     }

//     // Main method
//     public static void main(String[] args) {
//         // Creating object of Student class
//         Student s = new Student();

//         // Calling methods
//         s.printName();
//         s.printGrade();
//     }
// }
