package lab05;

public class Circle2 extends Shape { //extending super(parent class)
    double radius=1.0;  //initialse variables
    public Circle2(){ //empty self class

    }
    public Circle2(double radius){ //self class with one radius
        this.radius=radius;
        
        
       
    }
    public Circle2(double radius, String color, boolean filled){ //self class with three parameters
        //super(filled, color)
        this.radius=radius;
        this.color=color;
        this.filled=filled;
        
    }
    //getters and setters
    public double getRadius(){
        return this.radius;
    }  
    public void setRadius(double rad){
        this.radius=rad;
    }
    
    public double getArea(){
        double area=Math.PI*this.radius*this.radius;
        return area;
    }
    public double getPerimeter(){
        double perimeter=(2*Math.PI)*this.radius;  
        return perimeter;
    }
    public String toString(){ //string representation
        return "A Circle with radius="+this.radius+ " , which is a subclass of "+super.toString();
    }
}
