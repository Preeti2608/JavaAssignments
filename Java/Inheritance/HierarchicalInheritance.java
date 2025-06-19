package Inheritance;

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Main class to run the program
public class HierarchicalInheritance {
    public static void main(String[] args) {

        // Object of Dog
        Dog d = new Dog();
        d.eat();   // Inherited from Animal
        d.bark();  // Own method

        // Object of Cat
        Cat c = new Cat();
        c.eat();   // Inherited from Animal
        c.meow();  // Own method
    }
}
