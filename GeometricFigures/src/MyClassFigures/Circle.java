package MyClassFigures;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Circle extends Figures implements NumberOfPizzaSlices{
    String name = "MyClassFigures.Circle";
    private int radius;

    public Circle (int radius) {
        this.radius = radius;
    }

    @Override
    public void square() {
        double square = PI * Math.pow(radius, 2);
        System.out.printf("Square of %s is %f.\n",name, square);
    }

    @Override
    public void perimetre() {
        double perimetre = 2 * radius * PI ;
        System.out.printf("Perimetre of %s is %f.\n",name, perimetre);
    }

    public void inform() {
        System.out.println("Diametre of circle is " + radius * 2);
        System.out.println("..............");;
    }

    @Override
    public void WhatNumberOfPizzaSlices(){
        System.out.print("How many people will eat pizza? ");
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = 0;
        try {
            numberOfPeople = scanner.nextInt();
        } catch (Exception e){
        System.out.println("Sorry, cannot complete");
    }
        System.out.printf("Pizza of radius %d should be divided into %d pieces", radius, numberOfPeople);

//    int a = 4;
//        try{
//        System.out.println(a / 0);
//    } catch (ArithmeticException e){
//        System.out.println("Sorry, cannot complete");
//    }
//        System.out.println("XO");
}
}
