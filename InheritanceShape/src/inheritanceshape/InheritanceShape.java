package inheritanceshape;
public class InheritanceShape {
    public static void main(String[] args) {
        Square s = new Square();
        s.setSide(10);
        System.out.println(s.toString());
        
        Circle c = new Circle();
        c.setRadius(10);
        System.out.println(c.toString());
    }
}
