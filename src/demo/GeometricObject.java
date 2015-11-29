package demo;

import java.util.Date;

/**
 * 定义一个几何抽象类
 * Created by luts on 2015/11/29.
 */
public abstract class GeometricObject {
    private String name = null;
    private String color = "white";
    private boolean filled = false;
    private java.util.Date dateCreated;

    //无参构造器
    public GeometricObject(){
        dateCreated = new java.util.Date();
    }

    //含参构造器
    public GeometricObject(String name, String color, boolean filled){
        this.name = name;
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }


    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled ;
    }

    public abstract double getArea();  //求面积的抽象函数，在子类中实现

    public abstract double getPerimeter(); //求周长的抽象函数，在子类中实现
}
