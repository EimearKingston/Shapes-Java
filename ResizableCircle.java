package lab05;

public class ResizableCircle  extends Circle3 {  
    public ResizableCircle(double radius){
        super(radius);
    }
    public void resize(Integer percent){
        this.radius=radius*percent/100.0;
    }
    public String toString(){
        return "ResizableCircle[Circle[radius=" + this.radius+"]";
    }
}
