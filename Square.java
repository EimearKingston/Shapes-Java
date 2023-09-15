package lab05;

public class Square extends Rectangle { //extends super (parent) class Rectangle
    double side; //initailise variables
    public Square(){//slef class
        this.width=super.width;  
        this.length=super.length;
    }
    public Square(double side){ //self class with one parameter
        this.side=side;
        this.width=super.width;  
        this.length=super.length;
    }
    public Square(double side, String color, boolean filled){ //self class with three parameters
        this.color=color;  
        this.side=side;
        this.filled=filled;
    }  
    //getters and setters
    public double getSide(){
        return this.side;
    }  
    public void setSide(double side){
        this.side=side;
    }  
    public void setWidth(double side){
        this.width=side;
    }
      
    public void setLength(double side){
        this.length=side;
    }  
    public String toString(){//string represenatation
        return "A Square  with  width"+this.width+ " , which is a subclass of "+super.toString();
    }
}
    

