package lab05;

public class Cylinder extends Circle {
    double height;  //initialise variables
    public Cylinder(){ //self class
        this.height=1.0; 
    }
    public Cylinder(double radius){//self class wiht one paremter
        super(radius);
    }
    public Cylinder(double radius, double height, String color){ //self class with three parameters
        super(radius, color);  
        this.height=height;
    }
    //getters and setters
    public double getHeight(){
        return this.height;
    }  
    public void setHeight(String h){
        this.color=h;
    }
    public double getVolume(){
        double volume=this.height*(2*Math.PI)*this.radius*this.radius;
        return volume;
    }  
    public double getArea(){
        double area=(2*Math.PI)*this.radius*this.height+(2*(Math.PI*this.radius*this.radius));
        return area;
    }
}
