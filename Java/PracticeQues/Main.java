package PracticeQues;

class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length = 4;
    double breadth = 3;

    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.area();
        s2.area();
    }
}

