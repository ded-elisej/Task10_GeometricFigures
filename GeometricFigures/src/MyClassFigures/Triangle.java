package MyClassFigures;

import static java.lang.Math.*;

public class Triangle extends Figures{
    String name = "MyClassFigures.Triangle";
    private int length1;
    private int length2;
    private int angle1;

    public Triangle(int length1, int length2, int angle1){
         this.length1 = length1;
         this.length2 = length2;
         this.angle1 = angle1;
    }

    @Override
    public void square() {
        double square = 0.5 * length1 * length2 * sin(angle1);
        System.out.printf("Square of %s is %f.\n",name, square);
    }

    @Override
    public void perimetre() {
        double perimetre = length1 + length2 + sqrt(length1 * length1 + length2 * length2 - 2 * length1 * length2 * cos(angle1));
        System.out.printf("Perimetre of %s is %f.\n",name, perimetre);
    }

    public void heigh() {
        double height = (length1 * length2 * 0.5)/2;
        System.out.printf("Height of %s is %f.\n",name, height);
    }

    public void inform() {
        System.out.println("Side lengths of triangle is " + length1 + " and " + length2);
        System.out.println("Angle between sides of triangle is: " + angle1);
        System.out.println("..............");
    }

}
