package lab05;

public class Rectangle extends Shape{ //extending Shape super(parent) class
    double width; //initailise varaibles
    double length;  
    public Rectangle(){ //self class
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangle(double width, double length){ //self class wiht two variables
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color){ //self class with three variables
        this.width=width;
        this.length=length;
        this.color=color;
    }
    //getters and setters
    public double getWidth(){
        return this.width;
    }  
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return this.length;
    }  
    public void setLength(double length){
        this.length=length;
    }
    
    public double getArea(){
        double area=length*width;
        return area;
    }
    public double getPerimeter(){
        double perimeter=2*(length+width);  
        return perimeter;
    }
    public String toString(){ //string represenatation
        return "A  Rectangle  with  width="+this.width+ " and length"+this.length+ ", which is a subclass of " + super.toString();
    }

}
