package demo;

/**
 * 矩形类，继承于几何类
 * Created by luts on 2015/11/29.
 */

public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle(){

    }

    public Rectangle(String name, double newWidth, double newHeight){
        this.setName(name);
        this.width = newWidth;
        this.height = newHeight;
    }

    public  Rectangle(double newWidth, double newHeight, String newColor, boolean newFilled){
        this.width = newWidth;
        this.height = newHeight;
        setColor(newColor);
        setFilled(newFilled);
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double newWidth){
        this.width = newWidth;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double newHeight){
        this.height = newHeight;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }
}