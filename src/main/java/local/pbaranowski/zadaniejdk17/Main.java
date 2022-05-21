package local.pbaranowski.zadaniejdk17;

public class Main {
    public static void main(String[] args) {
        var p = new Point(2.0,3.0);
        System.out.println(p.distance(new Point(1,0)));
        var circle = new Circle(p,1);
        System.out.println(circle.getArea());
        System.out.println(circle.getDiameter());
    }
}