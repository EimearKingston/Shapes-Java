package lab05;

public class Circle3 implements GeometricObject {
    protected double radius;

    public Circle3(double radius){
        this.radius=radius;
       
    }
    public double getPerimeter() {
        double perimeter=(2*Math.PI)*this.radius;  
        return perimeter;
    }

    
    public double getArea() {
        double area=Math.PI*this.radius*this.radius;
        return area;
    }
    public String toString(){
        return "Circle[radius=" + this.radius+"]";
    }
}
