import java.util.*;

abstract class Shape{
    abstract void numberOfSides();
}

class Rectangle extends Shape{
    void numberOfSides(){
        System.out.println("sides of rectangle:"+4);
    }
}

class Triangle extends Shape{
    void numberOfSides(){
        System.out.println("sides of triangle:"+3);
    }
}

class Hexagon extends Shape{
    void numberOfSides(){
        System.out.println("sides of hexagon:"+6);
    }
}
public class NewShape {
    public static void main(String args[]){
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();
        Hexagon hex = new Hexagon();
        rec.numberOfSides();
        tri.numberOfSides();
        hex.numberOfSides();
    }

}