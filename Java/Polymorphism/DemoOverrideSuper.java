package Polymorphism;

class Gadget {
    void turnOn() {
        System.out.println("\nGadget is turning on");
    }
}

class Smartphone extends Gadget {
    // Overriding method and calling parent method using super
    void turnOn() {
        super.turnOn(); // Call to Gadget's method
        System.out.println("Smartphone is turning on with fingerprint");
    }
}

public class DemoOverrideSuper {
    public static void main(String[] args) {
        Gadget g = new Smartphone(); // Upcasting
        g.turnOn(); // Calls overridden method with super
    }
}
