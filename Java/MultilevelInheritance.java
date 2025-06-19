// package Inheritance;

// Program to demonstrate Multilevel Inheritance in Java

// Base class (Grandparent)
class LivingBeing {
    void breathe() {
        System.out.println("\nLiving being is breathing");
    }
}

// Intermediate class (Parent)
class Animal extends LivingBeing {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class (Child)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class to run the program
public class MultilevelInheritance {
    public static void main(String[] args) {

        // Creating object of Dog class
        Dog d = new Dog();

        // Accessing methods from all 3 classes
        d.breathe();  // From LivingBeing
        d.eat();      // From Animal
        d.bark();     // From Dog

        Animal a = new Animal();
        a.breathe();
        a.eat();

        LivingBeing l = new LivingBeing();
        l.breathe();
    }
}


