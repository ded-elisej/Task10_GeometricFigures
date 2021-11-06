package MyClassFigures;

public class Rectangle extends Figures {
    String name = "MyClassFigures.Rectangle";
    private int side1;
    private int side2;

    public Rectangle (int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    @Override
    public void square() {
        double square = side1 * side2;
        System.out.printf("Square of %s is %f.\n",name, square);
    }

    @Override
    public void perimetre() {
        double perimetre = 2 * (side1 + side2);
        System.out.printf("Perimetre of %s is %f.\n",name, perimetre);
    }

    public void inform() {
        System.out.println("Side lengths of rectangle is " + side1 + " and " + side2);
        System.out.println("Angle between sides of triangle is 90");
        System.out.println("..............");
    }

}
