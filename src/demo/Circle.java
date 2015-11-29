package demo;

/**
 * 圆类，继承于几何类
 * Created by luts on 2015/11/29.
 */

public class Circle extends GeometricObject {
    private double radius;

    public Circle(){

    }

    public Circle(String name, double newRadius){
        this.setName(name);
        this.radius = newRadius;
    }

    public Circle(double newRadius, String newColor, boolean newFilled){
        this.radius = newRadius;
        setColor(newColor);
        setFilled(newFilled);
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double getPerimeter(){
        return 2* radius * Math.PI;
    }

    public void printCircle(){
        System.out.println("The circle is creadted " + getDateCreated() + " and the raius is " + radius);
    }
}
