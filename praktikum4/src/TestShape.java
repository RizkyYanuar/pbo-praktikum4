public class TestShape {
    public static void main(String[] args) {
        // Shape s1 = new Shape();
        // Shape s2 = new Shape("blue", false);
        // System.out.println(s1);
        // System.out.println(s2);
        // Circle c1 = new Circle();
        // Circle c2 = new Circle(2.0);
        // Circle c3 = new Circle(3.0, "yellow", true);
        // System.out.println(c1);
        // System.out.println(c2);
        // System.out.println(c3);
        // Rectangle r1 = new Rectangle();
        // Rectangle r2 = new Rectangle(2.0, 3.0);
        // Rectangle r3 = new Rectangle(4.0, 5.0, "black", false);
        // System.out.println(r1);
        // System.out.println(r2);
        // System.out.println(r3);
        // Square s = new Square(5.0);
        // System.out.println("awal : " + s);
        // System.out.println("area : " + s.getArea());
        // s.setWidth(8.0);
        // System.out.println("sesudah setWidth(8): " + s);
        // s.setLength(3.0);
        // System.out.println("sesudah setLength(3): " + s);
        // System.out.println("area : " + s.getArea());
        // System.out.println("perimeter : " + s.getPerimeter());
        Shape a = new Shape("black", false);
        Circle b = new Circle(2.0, "blue", true);
        Rectangle c = new Rectangle(3.0, 4.0, "yellow", true);
        Square d = new Square(5.0, "green", true);
        System.out.println(a);
        System.out.println(b + " area=" + b.getArea());
        System.out.println(c + " area=" + c.getArea());
        System.out.println(d + " area=" + d.getArea());
    }

}
