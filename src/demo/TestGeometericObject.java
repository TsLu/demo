package demo;

/**
 * Created by luts on 2015/11/29.
 */

public class TestGeometericObject {
    public static void main(String[] args){
        GeometricObject geoObject1 = new Circle("Circle",5);
        GeometricObject geoObject2 = new Rectangle("Rectangle", 5, 3);

        System.out.println("The two objects have the same area ?" + equalsArea(geoObject1, geoObject2));

        displayGeometricObject(geoObject1);

        displayGeometricObject(geoObject2);
    }


    public static boolean equalsArea(GeometricObject obj1, GeometricObject obj2){
        return obj1.getArea() == obj2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object){
        System.out.println();
        System.out.println("The new " + object.getName()+ "'s area is: " + object.getArea());
        System.out.println("The new " + object.getName()+ "'perimeter is: " + object.getPerimeter());
    }
}
