package lab05;

public class Shape {
    String color; //initialise variables
    boolean filled;
    public Shape(){ //self class
        this.color="green";
        this.filled=true;
    }
    public Shape(String color, boolean filled){ //self class with two parameters
        this.color=color;
        this.filled=filled;
    }
    //getters and setters
    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setColor(String col){
        this.color=col;
    }
    public void setFilled(boolean fill){
        this.filled=fill;
    }  
    public String toString(){ //string representation
        String fill;
        //check if filled
        if (this.filled==true){
            fill="filled";
        }
        else{
            fill="Not filled";
        }
        return "A Shape with color of "+ this.color +" and " + fill;
    }
}
