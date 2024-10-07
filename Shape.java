import java.io.*;
abstract class Shape
{
    int a,b;
    Shape(int x, int y){
        a = x;
        b = y;
    }
    abstract double area();
    abstract double volume();
}
class Cone extends Shape{
    Cone(int x, int y){
        super(x,y);
    }
    double area(){
        return (a*b*3.14);
    }
    double volume(){
        return (3.14*a*a*b);
    }
}
class Cylinder extends Shape{

    Cylinder(int x, int y){
        super(x,y);
    }
    double area(){
        return (2*3.14*a*b*3.14*a*b);
    }
    double volume(){
        return (3.14*a*a*b);
    }
}