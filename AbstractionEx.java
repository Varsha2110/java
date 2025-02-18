abstract class Shape{
    abstract void erase();
    abstract void draw();
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("draw a circle");
    }
    @Override
    void erase(){
        System.out.println("erase a circle");
    }
}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("draw a Rectangle");
    }
    @Override
    void erase(){
        System.out.println("erase a Rectangle");
    }
}
class Square extends Shape{
    @Override
    void draw(){
        System.out.println("draw a square");
    }
    @Override
    void erase(){
        System.out.println("erase a square");
    }
}

class Oval extends Shape{
    @Override
    void draw(){
        System.out.println("draw a oval");
    }
    @Override
    void erase(){
        System.out.println("erase a Oval");
    }
}
public class AbstractionEx{
    public static void main(String[] args){
        Shape circle=new Circle();
        Shape rectangle=new Rectangle();
        Shape square=new Square();
        Shape oval=new Oval();
        circle.draw();
        rectangle.draw();
        square.draw();
        oval.draw();
        circle.erase();
        rectangle.erase();
        square.erase();
        oval.erase();
    }
}