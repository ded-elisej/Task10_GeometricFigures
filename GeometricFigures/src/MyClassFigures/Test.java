package MyClassFigures;

public class Test {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(10, 10, 60);
        Rectangle rectangle1 = new Rectangle(10, 20);
        Circle circle1 = new Circle(10);

        triangle1.square();
        triangle1.heigh();
        triangle1.perimetre();
        triangle1.inform();

        rectangle1.perimetre();
        rectangle1.square();
        rectangle1.inform();

        circle1.square();
        circle1.perimetre();
        circle1.inform();
        circle1.WhatNumberOfPizzaSlices();




    }
}
