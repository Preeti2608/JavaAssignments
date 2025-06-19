package Inheritance;

// Program to demonstrate Single Inheritance in Java

// Parent class
class Animal {
    void eat() {
        System.out.println("\nAnimal is eating");
    }
}

// Child class that inherits from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("\nCat is meowing");
    }
}

// Main class to run the program
public class SingleInheritance {
    public static void main(String[] args) {

        // Creating object of parent class
        Animal a = new Animal();
        a.eat(); // Output: Animal is eating

        // Creating object of child class
        Cat c = new Cat();
        c.meow(); // Output: Cat is meowing
        c.eat();  // Output: Animal is eating (inherited from Animal)
    }
}


// class Vehicle {
//     void startEngine() {
//         System.out.println("\nVehicle engine started");
//     }
// }
// class Car extends Vehicle {
//     void playMusic() {
//         System.out.println("\nCar is playing music");
//     }
// }
// public class SingleInheritanceExample {
//     public static void main(String[] args) {

  
//         Vehicle v = new Vehicle();
//         v.startEngine(); 
//         Car myCar = new Car();
//         myCar.playMusic();   
//         myCar.startEngine(); 
//     }
// }