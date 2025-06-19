package Inheritance;

// Common Parent Interface
interface LivingThing {
    void live();
}

// Another Interface
interface Runnable {
    void run();
}

// Another Interface
interface Thinkable {
    void think();
}

// Class implementing LivingThing + Runnable
class Robot implements LivingThing, Runnable {
    public void live() {
        System.out.println("Robot is functioning");
    }

    public void run() {
        System.out.println("Robot is running");
    }
}

// Class implementing LivingThing + Thinkable
class Human implements LivingThing, Thinkable {
    public void live() {
        System.out.println("Human is living");
    }

    public void think() {
        System.out.println("Human is thinking");
    }
}

// Main class
public class HybridInheritanceExample {
    public static void main(String[] args) {
        Robot r = new Robot();
        r.live();  // from LivingThing
        r.run();   // from Runnable

        Human h = new Human();
        h.live();   // from LivingThing
        h.think();  // from Thinkable
    }
}
