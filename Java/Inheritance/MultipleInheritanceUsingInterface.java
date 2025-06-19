package Inheritance;

// Interface 1
interface Flyable {
    void fly();
}

// Interface 2
interface Swimmable {
    void swim();
}

// Class implementing both interfaces
class Bird implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void swim() {
        System.out.println("Bird is swimming");
    }
}

// Main class to run the program
public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();   // Output: Bird is flying
        b.swim();  // Output: Bird is swimming
    }
}

