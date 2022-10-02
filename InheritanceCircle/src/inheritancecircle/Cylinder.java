package inheritancecircle;
public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
        height = 1.0;
     }
    
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }
    
    public Cylinder(double radius, double height, String color){
        super(radius,color);
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
 
    public double getVolume() {
        return getArea() * this.height;
    }
    
    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
        + " height = " + height;
    }
}
