package fr.epita.shapes.datamodel;

public class Circle {
    //the way to define a constant : static final
    private static final double PI = 3.14159;

    //this is the radius of the circle
    private double radius;

    public Circle(double r){
        this.radius = r;
    }
    /**
     * compute the area of the circle
     * @return the area
     */
    public double getArea(){
        return PI * radius * radius;
    }

    /**
     * compute the perimeter of the circle
     * @return the perimeter
     */
    public double getPerimeter(){
        return 2 * PI * radius;
    }
}
