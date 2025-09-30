package fr.epita.shapes.launcher;
import fr.epita.shapes.datamodel.Circle;
import fr.epita.shapes.datamodel.Triangle;

public class Launcher {




    public static void main(String[] args) {
        Circle smallCircle = new Circle(20);
        Circle bigCircle = new Circle(60);

        System.out.println("Small circle perimeter : " + smallCircle.getPerimeter() + ", area : " + smallCircle.getArea());
        System.out.println("Big circle perimeter : " + bigCircle.getPerimeter() + ", area : " + bigCircle.getArea());

        Triangle smallTriangle = new Triangle(20,15,12,20,15);
        Triangle bigTriangle = new Triangle(60,70,50,60,50);

        System.out.println("Small triangle perimeter : " + smallTriangle.getPerimeter() + ", area : " + smallCircle.getArea());
        System.out.println("Big triangle perimeter : " + bigTriangle.getPerimeter() + ", area : " + bigCircle.getArea());

    }



}
