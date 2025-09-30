package fr.epita.shapes.datamodel;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double base;
    private double height;

    public Triangle(double sideA, double sideB, double sideC, double base, double height){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.base = base;
        this.height = height;
    }
    /**
     * compute the area of the triangle
     * @return the area
     */
    public double getArea(){
        return 0.5 * base * height;
    }

    /**
     * compute the perimeter of the circle
     * @return the perimeter
     */
    public double getPerimeter(){
        return sideA + sideB + sideC;
    }
}
